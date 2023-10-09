package com.example.lab5_compose

import Navigation.AppRoute
import Navigation.Destinations
import Navigation.MyAppDestination
import Navigation.MyAppNavigationAct
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.lab5_compose.ui.theme.Lab5_ComposeTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            Lab5_ComposeTheme {
                val navController = rememberNavController()
                val navigateAction = remember(navController){
                    MyAppNavigationAct(navController)
                }
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val selectedDestination = navBackStackEntry?. destination?.route?: AppRoute.FIRSTSCREEN
                
                MyContent(
                    navController = navController,
                    selectedDestination = selectedDestination,
                    navigateTopLevelDestination = navigateAction::navigateTo
                )

            }
        }
    }
}

@Composable
fun MyContent(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    selectedDestination: String,
    navigateTopLevelDestination: (MyAppDestination) -> Unit
){
    Row(
        modifier = modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ){
            NavHost(
                modifier =Modifier.weight(1f),
                navController =navController,
                startDestination = AppRoute.FIRSTSCREEN
            ){
                composable(AppRoute.FIRSTSCREEN){
                    Activity1()
                }
                composable(AppRoute.SECONDSCREEN){
                    Activity2()
                }
                composable(AppRoute.THIRDSCREEN){
                    Activity3()
                }
                composable(AppRoute.FORTHSCREEN){
                    Activity4()
                }
            }
            MyBottomNavigation(
                selectedDestination = selectedDestination,
                navigateTopLevelDestination = navigateTopLevelDestination
            )
        }
    }
}

@Composable
fun MyBottomNavigation(
    selectedDestination: String,
    navigateTopLevelDestination: (MyAppDestination) -> Unit
){
    NavigationBar(
        modifier = Modifier.fillMaxWidth()
    ){
        Destinations.forEach { destinations ->
            NavigationBarItem(
                selected = selectedDestination == destinations.route,
                onClick = { navigateTopLevelDestination(destinations)},
                icon = {
                    Icon(
                        imageVector = destinations.selectedIcon,
                        contentDescription = stringResource(id = destinations.iconTextId)
                    )
                }
            )
        }
    }
}

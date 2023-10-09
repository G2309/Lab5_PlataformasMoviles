package Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.lab5_compose.R

class MyAppNavigationAct (private val navController: NavHostController){
    fun navigateTo(destination: MyAppDestination){
        navController.navigate(destination.route){
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
        }
    }
}

data class MyAppDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val iconTextId: Int
    )

val Destinations = listOf(
    MyAppDestination(
        route = AppRoute.FIRSTSCREEN,
        selectedIcon = Icons.Default.Home,
        iconTextId = R.drawable.arrow
    ),
    MyAppDestination(
        route = AppRoute.SECONDSCREEN,
        selectedIcon = Icons.Default.AccountCircle,
        iconTextId = androidx.compose.ui.R.string.tab
    ),
    MyAppDestination(
        route = AppRoute.THIRDSCREEN,
        selectedIcon = Icons.Default.AccountCircle,
        iconTextId = androidx.compose.ui.R.string.tab
    ),
    MyAppDestination(
        route = AppRoute.FORTHSCREEN,
        selectedIcon = Icons.Default.Add,
        iconTextId = androidx.compose.ui.R.string.tab
    )
)

object AppRoute{
    const val FIRSTSCREEN = "Act. 1"
    const val SECONDSCREEN = "Act. 2"
    const val THIRDSCREEN = "Act. 3"
    const val FORTHSCREEN = "Act. 4"
}

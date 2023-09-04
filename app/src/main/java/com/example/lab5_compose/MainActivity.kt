package com.example.lab5_compose

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import com.example.lab5_compose.ui.theme.Lab5_ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Activity1()
                }
            }
        }
    }
}

@Composable
fun Activity1(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF800090))
            //.background(color = Color.Transparent)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = Color(0xFFA657FF))
        ){
            Text(
            text = "Eventos",
                fontSize = 28.sp,
                color = Color.White,
                modifier = Modifier
                   .offset(x= 20.dp, y= 25.dp)
            )
           Image(
               painter = painterResource(id = R.drawable.menu),
               contentDescription = "Image",
               modifier = Modifier
                   .padding(10.dp)
                   .offset(x = 325.dp, y = -20.dp)
           )
       }
        Text(
            text = "Favoritos",
            fontSize=20.sp,
            color = Color.White,
            modifier = Modifier.offset(15.dp,10.dp))

        Spacer(modifier = Modifier.padding(5.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp,20.dp)
                    .background(Color.LightGray)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.microfono),
                    contentDescription = "Microfono",
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(x = 0.dp, y = 10.dp)
                )

                Text(
                    text = "Concierto A",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                )
            }
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp,20.dp)
                    .background(Color.LightGray)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.microfono),
                    contentDescription = "Microfono",
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(x = 0.dp, y = 10.dp)
                )

                Text(
                    text = "Concierto B",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp,20.dp)
                    .background(Color.LightGray)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.microfono),
                    contentDescription = "Microfono",
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(x = 0.dp, y = 10.dp)
                )

                Text(
                    text = "Concierto C",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                )
            }
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp,20.dp)
                    .background(Color.LightGray)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.microfono),
                    contentDescription = "Microfono",
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(x = 0.dp, y = 10.dp)
                )

                Text(
                    text = "Concierto D",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                )
            }
        }
        Text(
            text = "\tProximos conciertos",
            fontSize=20.sp,
            color = Color.White,
            modifier = Modifier.offset(15.dp,10.dp)
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp,20.dp)
                    .background(Color.LightGray)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.microfono),
                    contentDescription = "Microfono",
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(x = 0.dp, y = 10.dp)
                )

                Text(
                    text = "Concierto C",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                )
            }
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(20.dp,20.dp)
                    .background(Color.LightGray)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.microfono),
                    contentDescription = "Microfono",
                    modifier = Modifier
                        .padding(20.dp)
                        .offset(x = 0.dp, y = 10.dp)
                )

                Text(
                    text = "Concierto A",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab5_ComposeTheme {
        Activity1()
    }
}
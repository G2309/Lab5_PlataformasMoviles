package com.example.lab5_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5_compose.ui.theme.Lab5_ComposeTheme

class Act3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Lab5_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Activity3()
                }
            }
        }
    }
}
@Composable
fun Activity3(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF800090))

    ){
        Text(
           text = "Explanada Cardales, zona 16",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .offset(15.dp,20.dp)
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Image(
            painter = painterResource(id = R.drawable.cardales),
            contentDescription = "Cardales",
            modifier = Modifier
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .offset(15.dp,15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.calendario),
                contentDescription = "calendario",
                modifier = Modifier
                    .size(50.dp)
            )
            Text(
                text = "Fecha: 23 de Septiembre",
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier
                    .offset(15.dp,5.dp)
            )
            Text(
                text = "Hora: 21:00",
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier
                    .offset(-145.dp,35.dp)
            )
        }
        Text(
            text = "Acerca de:",
            color = Color.White,
            fontSize = 22.sp,
            modifier = Modifier
                .offset(15.dp,40.dp)
        )
        Text(
            text = "Linkin Park es una banda estadounidense de rock alternativo procedente de Agoura Hills, California formada en 1996. Integrada por Mike Shinoda, Dave Farrell, Joe Hahn, Brad Delson, Rob Bourdon y Chester Bennington, este último como voz principal",
            color = Color.White,
            fontSize = 11.sp,
            modifier = Modifier
                .offset(5.dp,50.dp)
                .widthIn(max=350.dp)
                .align(CenterHorizontally)
        )
        Row(
            modifier = Modifier
                .offset(35.dp,275.dp)
        ){
            Box(
                modifier = Modifier
                    .size(100.dp,50.dp)
                    .background(color = Color.LightGray)
        ){
            Text(
                text = "Favorite",
                modifier = Modifier
                    .offset(20.dp,13.dp)
            )
        }
            Spacer(modifier = Modifier.padding(50.dp))
            Box(
                modifier = Modifier
                    .size(100.dp,50.dp)
                    .background(color = Color.LightGray)
            ){
                Text(
                    text = "Buy",
                    modifier = Modifier
                        .offset(35.dp,13.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewActivity3(){
    Lab5_ComposeTheme {
        Activity3()
    }
}
package com.example.lab5_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5_compose.ui.theme.Lab5_ComposeTheme

class Act2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Activity2()
                }
            }
        }
    }
}
@Composable
fun Activity2(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF800090))
    ){
        Text(
            text = "Listado de proximos conciertos y sus lugares",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                    .offset(10.dp,15.dp)
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(color = Color(0xFFA657FF))
        ){
            Image(
                painter = painterResource(id = R.drawable.flecha),
                contentDescription = "Arrow",
                modifier = Modifier
                    .padding(10.dp)
            )
            //Banda que tocara
            Text(
                text = "Linkin Park",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(10.dp,5.dp)
            )
            Text(
                text = "Cardales",
                fontSize = 17.sp,
                color = Color.LightGray,
                modifier = Modifier
                    .offset(-85.dp,35.dp)
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(color = Color(0xFFA657FF))
        ){
            Image(
                painter = painterResource(id = R.drawable.flecha),
                contentDescription = "Arrow",
                modifier = Modifier
                    .padding(10.dp)
            )
            //Banda que tocara
            Text(
                text = "Malacates",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(10.dp,5.dp)
            )
            Text(
                text = "Explanada 5",
                fontSize = 17.sp,
                color = Color.LightGray,
                modifier = Modifier
                    .offset(-75.dp,35.dp)
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(color = Color(0xFFA657FF))
        ){
            Image(
                painter = painterResource(id = R.drawable.flecha),
                contentDescription = "Arrow",
                modifier = Modifier
                    .padding(10.dp)
            )
            //Banda que tocara
            Text(
                text = "Nirvana",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(10.dp,5.dp)
            )
            Text(
                text = "El jocotio",
                fontSize = 17.sp,
                color = Color.LightGray,
                modifier = Modifier
                    .offset(-45.dp,35.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewActivity2(){
    Lab5_ComposeTheme {
        Activity2()
    }
}


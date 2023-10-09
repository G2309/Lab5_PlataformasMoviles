package com.example.lab5_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
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

class Act4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Lab5_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Activity4()
                }
            }
        }
    }
}
@Composable
fun Activity4(){
    Column(
        modifier = Modifier
            .background(color = Color(0xFF800090))
            .fillMaxSize()
    ){

        Box(
            modifier = Modifier
                .align(CenterHorizontally)
                .fillMaxSize()
        ){
            Image(
                painter = painterResource(id = R.drawable.fondo),
                contentDescription = "Fondo de perfil"
            )
            Image(
                painter = painterResource(id = R.drawable.iconopersona),
                contentDescription = "Icono de foto de perfil",
                modifier = Modifier
                    .offset(150.dp,150.dp)
                    .size(100.dp)
            )
            Text(
                    text="Gustavo Adolfo Cruz Bardales",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .offset(60.dp,260.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.personamod),
                contentDescription = "Icono de foto de perfil",
                modifier = Modifier
                    .offset(5.dp,285.dp)
                    .size(80.dp)
            )
            Text(
                text="Editar Perfil",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(85.dp,315.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.toggle),
                contentDescription = "Toggle",
                modifier = Modifier
                    .offset(270.dp,360.dp)
                    .size(80.dp)
            )
            Text(
                text="Notificaciones",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(85.dp,385.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.conf),
                contentDescription = "Configuracion contraseña",
                modifier = Modifier
                    .offset(10.dp,430.dp)
                    .size(60.dp)
            )
            Text(
                text="Cambiar Contraseña",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(85.dp,450.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = "Configuracion contraseña",
                modifier = Modifier
                    .offset(10.dp,520.dp)
                    .size(60.dp)
            )
            Text(
                text="Favoritos",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(85.dp,540.dp)
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewActivity4(){
    Lab5_ComposeTheme {
        Activity4()
    }
}

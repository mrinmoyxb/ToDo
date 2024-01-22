package com.example.todo.View.ToDoLoginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.R

@Composable
fun LoginScreen(){
    var text by remember{ mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.primary_color))
        .padding(20.dp)) {
        Spacer(modifier = Modifier.height(50.dp))
        TextComponent(text = "Be Organized.", size = 42, color = Color.White, fontWeight = FontWeight.SemiBold)
        TextComponent(text = "Start Now.", size = 42, color = Color.Black, fontWeight = FontWeight.SemiBold)

        BoxWithConstraints(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = -110.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LoginScreenImage()
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 190.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                InputField(
                    text = text,
                    onValueChange = { it -> text = it },
                    label = "Enter your name"
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 350.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ToDoButton(
                    text = "Done",
                    fontSize = 20,
                    color = Color.White,
                    modifier = Modifier
                        .height(50.dp)
                        .width(130.dp),
                    buttonColor = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            }

        }



    }
}

@Preview(showBackground = true)
@Composable
fun DisplayLoginScreen(){
    LoginScreen()
}
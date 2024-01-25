package com.example.todo.View.ToDoNewTaskScreen.Components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.R
import com.example.todo.ui.theme.montserrat

@Composable
fun CreateNewTask(){
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    var heading by remember{mutableStateOf("")}
    var description by remember{mutableStateOf("")}

    Card(
        modifier = Modifier
            .height(550.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(30.dp),
        colors = CardDefaults.cardColors(Color(0xFFD8D8D8)),
        elevation = CardDefaults.cardElevation(10.dp)
    ){

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp),
            colors = CardDefaults.cardColors(colorResource(R.color.primary_color)),
            shape = RoundedCornerShape(bottomEnd = 0.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Create New Task.", fontSize = 35.sp, color = Color.White,
                    fontFamily = montserrat, fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
            }

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ){
            NewTaskScreenInputField(value = heading, onValueChange = {it->heading = it}, label = "Enter your heading")
            Spacer(modifier = Modifier.height(5.dp))
            NewTaskScreenInputField(value = heading, onValueChange = {it->heading = it}, label = "Description")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DisplayCreateNewTask(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        CreateNewTask()
    }
}
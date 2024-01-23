package com.example.todo.View.ToDoLoginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.R

@Composable
fun ToDoButton(
    text: String,
    fontSize: Int,
    color: Color,
    modifier: Modifier,
    buttonColor: Color,
    elevation: Int = 0,
    fontWeight: FontWeight,
    onClick: () -> Unit = {},

    ){
    Button(onClick = onClick,
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(buttonColor),
        elevation = ButtonDefaults.buttonElevation(elevation.dp),
        modifier = modifier
    ) {
        Text(text, fontSize = fontSize.sp, color = color, fontWeight = fontWeight)
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayToDoButton(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.primary_color))
        .padding(20.dp)) {
        
       ToDoButton(text = "Done", fontSize = 30, color = Color.White,
           buttonColor = Color.Black, modifier = Modifier.height(60.dp).width(150.dp), fontWeight = FontWeight.Medium)
    }
}
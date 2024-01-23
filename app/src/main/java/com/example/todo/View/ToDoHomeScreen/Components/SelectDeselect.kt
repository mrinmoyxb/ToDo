package com.example.todo.View.ToDoHomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.R

@Composable
fun SelectDeselectButton(
    image: Painter,
    buttonDescription: String,
    size: Int,
    buttonColor: Color,
    onClick: () -> Unit,
    paddingValue: Int = 10
){
    Card(
        shape = RoundedCornerShape(100.dp),
        colors = CardDefaults.cardColors(buttonColor)
    ){
        Box(
            modifier = Modifier.padding(paddingValue.dp)
        ){
            Icon(painter = image, contentDescription = buttonDescription, modifier = Modifier.size(size.dp),tint = Color.White)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DisplaySelectDeselectButton(){
    Row(
        modifier = Modifier.fillMaxWidth().padding(20.dp)
    ){
        SelectDeselectButton(image = painterResource(id = R.drawable.check_white), buttonDescription = "done",
            size = 30, onClick = {}, buttonColor = colorResource(R.color.primary_color))
        Spacer(Modifier.width(10.dp))
        SelectDeselectButton(image = painterResource(id = R.drawable.check_white), buttonDescription = "done",
            size = 30, onClick = {}, buttonColor = Color.Black)
        Spacer(Modifier.width(10.dp))
        SelectDeselectButton(image = painterResource(id = R.drawable.cross_black), buttonDescription = "done",
            size = 30, onClick = {}, buttonColor = colorResource(R.color.primary_color))
        Spacer(Modifier.width(10.dp))
        SelectDeselectButton(image = painterResource(id = R.drawable.cross_black), buttonDescription = "done",
            size = 30, onClick = {}, buttonColor = Color.Black)
    }

}
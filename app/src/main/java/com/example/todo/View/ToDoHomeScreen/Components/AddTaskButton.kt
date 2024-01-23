package com.example.todo.View.ToDoHomeScreen.Components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun AddTaskButton(
    image: Painter,
    onClick: () -> Unit,
    paddingValue: Int,
    size: Int
){
    Card(
        shape = RoundedCornerShape(100.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.button_grey))
    ){
        Box(
            modifier = androidx.compose.ui.Modifier.padding(paddingValue.dp)
        ){
            Icon(painter = image, contentDescription = "add new task", modifier = Modifier.size(size.dp))
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DisplayAddTaskButton(){
    Row(){
    AddTaskButton(image = painterResource(id = R.drawable.plus), onClick = { },
        paddingValue = 10, size = 50)
        }
}
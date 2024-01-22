package com.example.todo.View.ToDoLoginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.R

@Composable
fun LoginScreenImage() {
    Image(painter = painterResource(R.drawable.girl),
        contentDescription = "login screen image",
        alignment = Alignment.Center,
        modifier = Modifier.fillMaxHeight().fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayLoginScreenImage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.primary_color))
        .padding(20.dp)) {
        LoginScreenImage()
    }
}
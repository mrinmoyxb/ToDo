package com.example.todo.View.ToDoLoginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.R
import com.example.todo.ui.theme.montserrat

@Composable
fun TextComponent(
    text: String,
    size: Int,
    color: Color,
    fontWeight: FontWeight,
    modifier: Modifier = Modifier,
){
    Text(text,
        fontSize = size.sp,
        color = color,
        fontWeight = fontWeight,
        fontFamily = montserrat,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayTextComponent(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.primary_color))
        .padding(20.dp)) {

        TextComponent(
            text = "Be Organized.",
            size = 40,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )

        TextComponent(
            text = "Start Now.",
            size = 40,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold
        )
    }
}
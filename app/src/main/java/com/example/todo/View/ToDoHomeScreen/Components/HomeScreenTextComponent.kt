package com.example.todo.View.ToDoHomeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.R
import com.example.todo.ui.theme.montserrat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun HomeScreenTextComponent(
    text: String,
    fontSize: Int,
    fontWeight: FontWeight,
    color: Color,
    fontStyle: FontStyle = FontStyle.Normal,
    modifier: Modifier = Modifier,
){
    Text(text,
        fontSize = fontSize.sp,
        fontFamily = montserrat,
        fontWeight = fontWeight,
        color = color,
        fontStyle = fontStyle,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayHomeScreenText(){
    val formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy")
    var currentDateTime = LocalDateTime.now().format(formatter)
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        HomeScreenTextComponent(
            text = "Today.",
            fontSize = 60,
            fontWeight = FontWeight.SemiBold,
            color = colorResource(id = R.color.primary_color)
        )
        //Spacer(modifier = Modifier.height(10.dp))
        HomeScreenTextComponent(
            text = currentDateTime,
            fontSize = 25,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Italic,
            color = Color.Black
        )
    }
}



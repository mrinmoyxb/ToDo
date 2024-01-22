package com.example.todo.View.ToDoHomeScreen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Ro
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.Logic.dayAndDate
import com.example.todo.Logic.generateDayAndDate
import com.example.todo.Logic.today
import com.example.todo.Model.HomeScreenData.DayAndDate
import com.example.todo.R
import java.time.LocalDate

@Composable
fun DayButton(
    day: String,
    date: Int,
    textColor: Color,
    buttonColor: Color
){
    Card(
        modifier = Modifier
            .height(100.dp)
            .width(90.dp),
        colors = CardDefaults.cardColors(buttonColor),
        shape = RoundedCornerShape(20.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HomeScreenTextComponent(
                text = day, fontSize = 25,
                fontWeight = FontWeight.Light, color = textColor, fontStyle = FontStyle.Italic
            )
            HomeScreenTextComponent(
                text = date.toString(), fontSize = 30,
                fontWeight = FontWeight.SemiBold, color = textColor, fontStyle = FontStyle.Normal
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DisplayDayButton1(){
    val date = LocalDate.now()
    val today = date.dayOfMonth
    val demo = DayAndDate(22, "mon")
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Top
    ) {
        DayButton(demo.dayOfWeek, demo.date, textColor = Color.White, buttonColor = colorResource(id = R.color.primary_color))
        }
}


@Preview(showBackground = true)
@Composable
fun LazyDisplayDayButton2(){
    generateDayAndDate()
    val date = LocalDate.now()
    val today = date.dayOfMonth
    LazyRow(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        //contentPadding = PaddingValues(horizontal = 10.dp)
    ){
        items(dayAndDate){day->
            if(today==day.date){
                DayButton(day.dayOfWeek, day.date, textColor = Color.White, buttonColor = colorResource(id = R.color.primary_color))
            }
            else{
                DayButton(day.dayOfWeek, day.date, textColor = Color.Black, buttonColor = colorResource(id = R.color.button_grey))
            }
        }
    }
}




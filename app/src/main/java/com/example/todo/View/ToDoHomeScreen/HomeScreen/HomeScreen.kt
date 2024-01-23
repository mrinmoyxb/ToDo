package com.example.todo.View.ToDoHomeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.Logic.dayAndDate
import com.example.todo.Logic.generateDayAndDate
import com.example.todo.R
import com.example.todo.View.ToDoHomeScreen.Components.AddTaskButton
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun HomeScreen(){
    val date = LocalDate.now()
    val format = DateTimeFormatter.ofPattern("MMMM dd, yyyy")
    val today = date.format(format)
    var current_date = date.dayOfMonth

    generateDayAndDate()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        HomeScreenTextComponent(text = "Today.", fontSize = 60, fontWeight = FontWeight.SemiBold, color = colorResource(id = R.color.primary_color))
        HomeScreenTextComponent(text = today , fontSize = 25, fontWeight = FontWeight.Medium, color = Color.Black, fontStyle = FontStyle.Italic)

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(dayAndDate){day->
                if(current_date == day.date){
                    DayAndDateButton(day = day.dayOfWeek, date = day.date, textColor = Color.White, buttonColor = colorResource(
                        id = R.color.primary_color))
                }
                else{
                    DayAndDateButton(day = day.dayOfWeek, date = day.date, textColor = Color.Black, buttonColor = colorResource(
                        id = R.color.button_grey))
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            TaskBar(heading = "Team meeting", time = "9:00 am", description = "At office, deployment of new updates", cardColor = colorResource(
                id = R.color.primary_color), buttonColor = colorResource(id = R.color.black))
            Spacer(modifier = Modifier.height(15.dp))
            TaskBar(heading = "Project Submission", time = "5:00 pm", description = "Deadline of version 2.0", cardColor = colorResource(
                id = R.color.black), buttonColor = colorResource(id = R.color.primary_color))

        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(15.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            AddTaskButton(image = painterResource(id = R.drawable.plus), onClick = { }, paddingValue = 15, size = 50)
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DisplayHomeScreen(){
    HomeScreen()
}
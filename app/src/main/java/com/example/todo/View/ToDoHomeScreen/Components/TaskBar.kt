package com.example.todo.View.ToDoHomeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.R

@Composable
fun TaskBar(
    heading: String,
    time: String,
    description: String,
    cardColor: Color,
    buttonColor: Color
){
    val configuration = LocalConfiguration.current
    val width = configuration.screenWidthDp
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .height(150.dp)
            .width((width - 20).dp),
        colors = CardDefaults.cardColors(cardColor)
    ){

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ){
            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(0.9f)
            ){
                HomeScreenTextComponent(text = heading, fontSize = 30, fontWeight = FontWeight.SemiBold, color = Color.White)
                HomeScreenTextComponent(text = time, fontSize = 18, fontWeight = FontWeight.Medium, color = Color.White, fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.height(5.dp))
                Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.White)
                HomeScreenTextComponent(text = description, fontSize = 20 , fontWeight = FontWeight.Medium, color = Color.White, modifier = Modifier.wrapContentHeight())
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 10.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.End
            ) {
                SelectDeselectButton(image = painterResource(id = R.drawable.check_white),
                    buttonDescription = "done", size = 20, onClick = {}, paddingValue = 8, buttonColor = buttonColor
                )
                Spacer(modifier = Modifier.height(5.dp))
                SelectDeselectButton(image = painterResource(id = R.drawable.cross_black),
                    buttonDescription = "done", size = 20, onClick = {}, paddingValue = 8, buttonColor = buttonColor
                )

            }
        }




    }
}


@Preview(showBackground = true)
@Composable
fun DisplayTaskBar() {
    Column(
        modifier = Modifier.padding(20.dp)
    ) {
        TaskBar(heading = "Team meeting", time = "9:00 am", description = "At Office, with boss prepare the presentation, ver 2.0", cardColor = colorResource(
            id = R.color.primary_color), buttonColor = colorResource(id = R.color.black))
        Spacer(modifier = Modifier.height(10.dp))
        TaskBar(heading = "Submission", time = "1:00 pm", description = "Deadline of project submission", cardColor = colorResource(
            id = R.color.black), buttonColor = colorResource(id = R.color.primary_color))
    }
}
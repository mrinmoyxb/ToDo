package com.example.todo.Logic

import com.example.todo.Model.HomeScreenData.DayAndDate
import java.time.LocalDate

val today = LocalDate.now()
val currentDay = today.dayOfMonth
val numberOfDays = today.lengthOfMonth()

val dayAndDate: MutableList<DayAndDate> = mutableListOf()

// stored the date and day in dayAndDate list for current month
fun generateDayAndDate(){
    for(date in currentDay..numberOfDays){
        val _currentDate = LocalDate.of(today.year, today.month, date)
        val dayOfMonth = _currentDate.dayOfWeek.name.substring(0, 3)
        dayAndDate.add(DayAndDate(date, dayOfMonth))
    }
}
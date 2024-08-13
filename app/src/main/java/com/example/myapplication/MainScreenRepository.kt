package com.example.myapplication

class MainScreenRepository {
    fun getProgrammingItems() = listOf(
        ProgrammingTermItem.Android(),
        ProgrammingTermItem.FooBar(),
        ProgrammingTermItem.Github(),
        ProgrammingTermItem.HelloWorld()
    )
}

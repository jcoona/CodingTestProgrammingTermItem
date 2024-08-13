package com.example.myapplication

import androidx.annotation.StringRes

data class MainState(
    val loading: Boolean = false,
    val showDialog: Boolean = false,
    val items: List<ProgrammingTermItem> = emptyList()
)

sealed class ProgrammingTermItem(
    @StringRes val leftText: Int,
    @StringRes val rightText: Int
) {
    class HelloWorld : ProgrammingTermItem(R.string.hello_world_left, R.string.hello_world_right)
    class FooBar: ProgrammingTermItem(R.string.foobar_left, R.string.foobar_right)
    class Github: ProgrammingTermItem(R.string.github_left, R.string.github_right)
    class Android: ProgrammingTermItem(R.string.android_left, R.string.android_right)
}

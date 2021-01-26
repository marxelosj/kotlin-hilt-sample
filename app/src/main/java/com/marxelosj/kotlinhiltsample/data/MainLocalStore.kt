package com.marxelosj.kotlinhiltsample.data

import javax.inject.Inject

class MainLocalStore @Inject constructor() {
    fun getLocalItems() = listOf("Item 1", "Item 2", "Item 3")
}
package com.example.artapp

import com.example.artspace.R

/**
 * List of image and titles
 */
class ItemList(
    val imgRes: Int,
    val description: Int
)

fun setImg(): List<ItemList> {
    return listOf(
        ItemList(imgRes = R.drawable.one, description = R.string.one),
        ItemList(imgRes = R.drawable.two, description = R.string.two),
        ItemList(imgRes = R.drawable.three, description = R.string.three),
        ItemList(imgRes = R.drawable.four, description = R.string.four),
        ItemList(imgRes = R.drawable.five, description = R.string.five)
    )
}

/**
 * A fake database.
 * To facilitate the use of resources when pressing the
 * button and so change the content on the screen
 */
class FakeDatabase {
    val setAll = setImg()
}
package com.example.retrofitimplement.Model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Products(

        // used to map img_src from the JSON to imgSrcUrl in our class

        val usercode: String,
        val itemName: String,
        val catagory: String,
        val acRate: Double,
        val acdRate: Double,
        val nonacRATE: Double,
        val parcel: Double,
        val tax: Double,
        val unit: String
)
package com.example.jsonconvert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import kotlin.collections.List

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()

        val jsonToObject = "[\n" +
                "{\n" +
                "\"id\": \"6212577f0095c22f40b1a78a\",\n" +
                "\"email\": \"fields_tyson@manglo.degree\",\n" +
                "\"roles\": [\n" +
                "\"owner\",\n" +
                "\"guest\"\n" +
                "],\n" +
                "\"apiKey\": \"f767f1e7-63e2-4f7b-984d-1f4743e7dfd1\",\n" +
                "\"profile\": {\n" +
                "\"dob\": \"17.02.1989\",\n" +
                "\"name\": \"Fields Tyson\",\n" +
                "\"about\": \"Quis labore commodo culpa aliquip cillum deserunt culpa non pariatur minim ullamco reprehenderit nulla esse. Ullamco aliquip do commodo cillum.\",\n" +
                "\"address\": \"59 Menahan Street, Loretto, Washington\",\n" +
                "\"company\": \"Manglo\",\n" +
                "\"location\": {\n" +
                "\"lat\": 56.740646,\n" +
                "\"long\": -60.715809\n" +
                "}\n" +
                "},\n" +
                "\"username\": \"fields89\",\n" +
                "\"createdAt\": \"09.12.2013T14:53:16.548Z\",\n" +
                "\"updatedAt\": \"10.12.2013T14:53:16.548Z\"\n" +
                "}\n" +
                "]"

        val model = gson.fromJson(jsonToObject, Array<PersonModel>::class.java).toList()

        Log.e("LOG", model.toString())

        val objectToJson = gson.toJson(model)

        Log.e("LOG", objectToJson)



    }
}
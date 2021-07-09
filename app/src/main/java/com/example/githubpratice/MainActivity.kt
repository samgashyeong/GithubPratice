package com.example.githubpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //준상선배 레포지토리임.
        println("밥먹고싶다.")
        println("얘들아 안녕")
    }
}
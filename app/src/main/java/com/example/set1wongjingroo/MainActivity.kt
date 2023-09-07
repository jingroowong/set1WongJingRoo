package com.example.set1wongjingroo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner : Spinner = findViewById(R.id.courseSelection)
        //spinner.onItemSelectedListener = this
        ArrayAdapter.createFromResource(this,R.array.courseCode,android.R.layout.simple_spinner_item).also {
            adapter->adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        }

        var clickBtn : Button = findViewById(R.id.contactBtn)
        clickBtn.setOnClickListener {
            getGrade(it)
        }


    }

    private fun getGrade(view :View){
        var score : Int = Integer.getInteger(findViewById(R.id.scoreInput))

        var grade : String
        if(score>=80 && score<=100){
            grade="A"
        }else  if(score>=75){
            grade="A-"}
        else  if(score>=70){
            grade="B+"
        }else  if(score>=65){
            grade="B"
        }
        else  if(score>=60){
            grade="B-"
        }
        else  if(score>=55){
            grade="C+"
        }else  if(score>=50){
            grade="C"
        }else {
            grade="D"
        }
        var gradeText :TextView = findViewById(R.id.gradeLabel)
        gradeText.text = grade
    }

}
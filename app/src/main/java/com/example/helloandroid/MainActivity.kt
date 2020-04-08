package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayys()
    }

    private fun arrayys(){
        val nom = "PEP"
        val surname = "Guardiola"
        val equip = "Barça"
        val edat = 40
        val myArray = arrayListOf<String>()
        myArray.add(nom)
        myArray.add(surname)
        println(myArray)
        myArray.addAll(listOf("Hello","Wellcome"))
        println(myArray)
        var ei= myArray[0]
        println(ei)
        myArray.forEach{
            println(it)
        }

        myArray.count()
        myArray.first()
        myArray.last()
        myArray.sort()
        myArray.clear()

    }


}

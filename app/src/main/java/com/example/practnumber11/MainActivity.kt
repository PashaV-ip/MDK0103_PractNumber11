package com.example.practnumber11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable

class MainActivity : AppCompatActivity() {
    var checkedButton:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick_ButtonLoadImage(view: View){
        val imageViewPear:ImageView = findViewById(R.id.imageView2)
        imageViewPear.setImageResource(R.drawable.pear)
    }
    fun onClick_ImageButton(view: View){
        val imageButton:ImageButton = findViewById(R.id.imageButton)
        if(checkedButton == false) { //imageButton.background.equals(R.drawable.off
            imageButton.setImageResource(R.drawable.on)
            checkedButton = true
        }
        else{
            imageButton.setImageResource(R.drawable.off)
            checkedButton = false
        }
    }
}
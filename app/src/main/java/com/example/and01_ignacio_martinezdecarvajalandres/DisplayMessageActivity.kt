package com.example.and01_ignacio_martinezdecarvajalandres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        findViewById<Switch>(R.id.switch2).setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked)
            {
                findViewById<Switch>(R.id.switch2).text = resources.getString(R.string.DC)
                findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.dc)

            }else
            {
                findViewById<Switch>(R.id.switch2).text = resources.getString(R.string.Marvel)
                findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.marvel)
            }

        }

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
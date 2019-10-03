package com.startandroid.retrofitpoject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
    val url = "https://webhook.site/17366a47-aba3-474b-b019-bbc374af9252"
    // used for testing WEB-site: https://webhook.site/#!/17366a47-aba3-474b-b019-bbc374af9252/70891435-505b-4845-9f04-26aab7a7c85c/1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.hi) as TextView


        textView.setOnClickListener() {


            doAsync{
                Request(url).run()
                uiThread { longToast("Request performed") }
            }
        }
    }
}
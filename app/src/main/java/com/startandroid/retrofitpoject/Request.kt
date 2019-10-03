package com.startandroid.retrofitpoject

import android.util.Log
import java.net.URL
import java.nio.charset.Charset


class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
        //Log Tag is 'Request'
    }
}
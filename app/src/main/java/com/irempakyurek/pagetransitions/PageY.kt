package com.irempakyurek.pagetransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PageY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_y)
    }

    override fun onBackPressed() {
        val intent = Intent(this@PageY, MainActivity::class.java)
        startActivity(intent)
    }
}
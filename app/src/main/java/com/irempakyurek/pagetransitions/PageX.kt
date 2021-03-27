package com.irempakyurek.pagetransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page_x.*

class PageX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_x)

        btnY.setOnClickListener {
            val intent = Intent(this@PageX, PageY::class.java)
            startActivity(intent)
        }
    }
}
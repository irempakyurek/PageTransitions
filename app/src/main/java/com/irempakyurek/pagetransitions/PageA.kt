package com.irempakyurek.pagetransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page_a.*

class PageA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_a)

        btnB.setOnClickListener {
            val intent = Intent(this@PageA, PageB::class.java)
            startActivity(intent)
        }
    }
}
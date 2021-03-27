package com.irempakyurek.pagetransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnA.setOnClickListener {
            val intent = Intent(this@MainActivity, PageA::class.java)
            startActivity(intent)
        }

        btnX.setOnClickListener {
            val intent = Intent(this@MainActivity, PageX::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val cikisIntent = Intent(Intent.ACTION_MAIN)
        cikisIntent.addCategory(Intent.CATEGORY_HOME)
        cikisIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(cikisIntent)
    }
}
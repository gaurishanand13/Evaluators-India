package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third_stage.*

class thirdStage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_stage)

        yesPancard.setOnClickListener {
            startActivity(Intent(this,fourthStage::class.java))
        }
        noPanCard.setOnClickListener {
            Toast.makeText(this,"Sorry you are not eligible for Loan \n To avail Loan you must have a Pancard",Toast.LENGTH_LONG).show()
        }
    }
}

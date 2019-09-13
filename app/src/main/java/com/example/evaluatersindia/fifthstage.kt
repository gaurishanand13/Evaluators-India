package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fifthstage.*

class fifthstage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifthstage)

        yesSalary.setOnClickListener {
            startActivity(Intent(this,lastStage::class.java))
        }
        noSalary.setOnClickListener {
            Toast.makeText(this,"Sorry you are not eligible for the loan. You must have atleast 6 months salary in your bank",Toast.LENGTH_LONG).show()
        }
    }
}

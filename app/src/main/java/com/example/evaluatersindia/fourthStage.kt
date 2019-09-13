package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fourth_stage.*

class fourthStage : AppCompatActivity() {

    var salarySlip = false;
    var bankStatement = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_stage)

        salarySlipCheckBox.setOnClickListener {
            salarySlip = salarySlip!=true
        }
        bankStatementCheckBox.setOnClickListener {
            bankStatement = bankStatement!=true
        }

        nextButtonRequirements.setOnClickListener {
            if(salarySlip==false || bankStatement==false)
            {
                Toast.makeText(this,"You are not eligible for the loan if you don't have all the mentioned above documents",Toast.LENGTH_LONG).show()
            }
            else
            {
                startActivity(Intent(this,fifthstage::class.java))
            }
        }
    }
}

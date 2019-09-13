package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_address_proof.*

class addressProof : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address_proof)

        yesAddress.setOnClickListener {
            val intent = Intent(this,addressProofAnswer::class.java)
            intent.putExtra("data",1)
            startActivity(intent)
        }
        noAddress.setOnClickListener {
            val intent = Intent(this,addressProofAnswer::class.java)
            intent.putExtra("data",2)
            startActivity(intent)
        }
    }
}

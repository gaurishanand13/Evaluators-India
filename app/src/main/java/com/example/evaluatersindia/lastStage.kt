package com.example.evaluatersindia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_last_stage.*

class lastStage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_stage)
        finalLastStageButton.setOnClickListener {
            lastStageFrameLayout.visibility = View.GONE;
            secondFrameLayout.visibility = View.VISIBLE
        }

    }
}

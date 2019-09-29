package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third_stage.*

class thirdStage : AppCompatActivity() {

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_stage)

        val havePanCard = intent.getBooleanExtra("pancard",false)
        val haveSixMonthsSalary = intent.getBooleanExtra("sixMonthsSalaryInBank",false)
        var addressAns = intent.getBooleanExtra("addressYes",false)
        var addressDocuments = intent.getStringExtra("addressAns")
        var mandatoryDocuments = intent.getStringExtra("mandatoryDocuments")

        if(havePanCard==false || haveSixMonthsSalary == false || !addressDocuments.equals("") || !mandatoryDocuments.equals(""))
        {
            noCongo.visibility = View.VISIBLE
            congoTextView.visibility = View.GONE
            if(addressAns==false)
            {
                notMandatoyRequirements.visibility = View.GONE
            }
            if(addressAns==true && addressDocuments.length==0)
            {
                notMandatoyRequirements.visibility = View.GONE
            }
            var finalMandatory = ""
            if(havePanCard==false){
                finalMandatory = finalMandatory + "Pancard\n"
            }
            if(haveSixMonthsSalary==false)
            {
                finalMandatory = finalMandatory + "Six months salary in Bank\n"
            }
            var m = mandatoryDocuments.split('.')
            Log.i("m",m.toString())
            for(x in m)
            {
                if(!x.isEmpty())
                {
                    finalMandatory = finalMandatory + x + "\n"
                }
            }
            Log.i("final",finalMandatory + "hello")
            val n = addressDocuments.split('.')
            Log.i("n",n.toString())
            if(addressAns==false)
            {
                for (ch in n)
                {
                    if(!ch.isEmpty())
                    {
                        finalMandatory = finalMandatory + ch + "\n"
                    }
                }
            }
            Log.i("final",finalMandatory)
            textViewMandatory.text = finalMandatory
        }
        else
        {
            //Congo for the loan
            noCongo.visibility = View.GONE
            congoTextView.visibility = View.VISIBLE
        }
    }
}

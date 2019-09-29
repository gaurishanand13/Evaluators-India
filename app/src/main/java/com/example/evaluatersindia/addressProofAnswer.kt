package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_address_proof_answer.*

class addressProofAnswer : AppCompatActivity() {

    var rentAgreement = false
    var electricity = false
    var passport = false
    var aadhar = false
    var voterId = false
    var drivingLicense = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address_proof_answer)
//        if(intent.getIntExtra("data",1)==1)
//        {
//            yesAddressFrameLayout.visibility = View.VISIBLE
//        }
//        else
//        {
//            noAddressFrameLayout.visibility = View.VISIBLE
//        }
//
//        rentAgreementCheckBox.setOnClickListener {
//            rentAgreement = rentAgreement != true
//        }
//        electricityCheckBox.setOnClickListener {
//            electricity = electricity != true
//        }
//        passportCheckBox.setOnClickListener {
//            passport = passport!= true
//        }
//        aadharCheckBox.setOnClickListener {
//            aadhar = aadhar!= true
//        }
//        voterIDCheckBox.setOnClickListener {
//            voterId = voterId!= true
//        }
//        drivinglicenseCheckBox.setOnClickListener {
//            drivingLicense = drivingLicense!= true
//        }
//
//        nextButton.setOnClickListener {
//            if(passport==true || aadhar == true || voterId==true||drivingLicense==true)
//            {
//                startActivity(Intent(this,thirdStage::class.java))
//            }
//            else{
//                Toast.makeText(this,"Sorry, But to avail loan you must have atleast one of the above mentioned document",Toast.LENGTH_LONG).show()
//            }
//        }
//
//        nextButtonForNo.setOnClickListener {
//            if(rentAgreement==false || electricity==false)
//            {
//                Toast.makeText(this,"Sorry, But to avail loan you must have both the above mentioned documents",Toast.LENGTH_LONG).show()
//            }
//            else
//            {
//                startActivity(Intent(this,thirdStage::class.java))
//            }
//        }
    }
}

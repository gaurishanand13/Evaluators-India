package com.example.evaluatersindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_address_proof.*

class addressProof : AppCompatActivity() {


    /**
     * Variables for address
     */
    val addressDocumentsRequired = ArrayList<String>() //to Store required documents
    var address_yes_no_answer = 0 //it will also be used to check if user has answered or not

    /**
     * Variables for the pancard
     */
    var havePanCard= false //if not selected, I am assuming that the person does Not have a PanCard

    /**
     * Variables for Mandatory Documents
     */
    var mandatoryDocumentedRequired = ArrayList<String>()

    /**
     * variable for 6 months salary in bank
     */
    var sixMonthsSalaryInBank = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address_proof)


        /**
         * Setting up the onClick for address radio buttons
         */
        yesAddress.setOnClickListener {
            if(address_yes_no_answer==1)
            {
                yesAddressLinearLayout.visibility = View.GONE
                noAddressLinearLayout.visibility = View.GONE
                yesAddress.isChecked = false
                address_yes_no_answer = 0
            }else{
                address_yes_no_answer = 1
                noAddress.isChecked = false
                yesAddressLinearLayout.visibility = View.VISIBLE
                noAddressLinearLayout.visibility = View.GONE
            }
        }
        noAddress.setOnClickListener {
            if(address_yes_no_answer==2)
            {
                yesAddressLinearLayout.visibility = View.GONE
                noAddressLinearLayout.visibility = View.GONE
                noAddress.isChecked = false
                address_yes_no_answer = 0
            }else
            {
                address_yes_no_answer = 2
                yesAddress.isChecked = false
                yesAddressLinearLayout.visibility = View.GONE
                noAddressLinearLayout.visibility = View.VISIBLE
            }
        }

        /**
         * Setting up the onClick for the PanCard Radio Buttons
         */
        yesPancard.setOnClickListener {
            if(havePanCard==true)
            {
                yesPancard.isChecked = false
                havePanCard = false
            }else{
                noPanCard.isChecked = false
                havePanCard = true
            }
        }
        noPanCard.setOnClickListener {
            yesPancard.isChecked = false
            havePanCard = false
        }

        /**
         * Setting up of the 6 months salary checkbox
         */
        yesSixMonthsSalary.setOnClickListener {
            if(sixMonthsSalaryInBank==true)
            {
                yesSixMonthsSalary.isChecked = false
                sixMonthsSalaryInBank = false
            }else{
                noSixMonthsSalary.isChecked = false
                sixMonthsSalaryInBank = true
            }
        }
        noSixMonthsSalary.setOnClickListener {
            yesSixMonthsSalary.isChecked = false
            sixMonthsSalaryInBank = false
        }

        /**
         * Now setting up the finalButton
         */
        submitButton.setOnClickListener {
            if(address_yes_no_answer ==0)
            {
                Toast.makeText(this@addressProof,"Please select if you have a address proof or not",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,thirdStage::class.java)
                intent.putExtra("pancard",havePanCard)
                intent.putExtra("sixMonthsSalaryInBank",sixMonthsSalaryInBank)

                /**
                 * Now checking for address documents
                 */
                if(address_yes_no_answer==1)
                {
                    intent.putExtra("addressYes",true)
                }else{
                    intent.putExtra("addressYes",false)
                }
                checkForAddress()
                var x = ""
                for(s in addressDocumentsRequired){
                    x = x + s
                    x = x + '.'
                }
                intent.putExtra("addressAns",x)


                check_for_MandatoryDocuments()
                var m = ""
                for(s in mandatoryDocumentedRequired){
                    m = m + s
                    m = m + '.'
                }
                intent.putExtra("mandatoryDocuments",m)
                startActivity(intent)
            }
        }
    }


    /**
     * if answer is no for address and the user hasn't ticked all the options , then it will return that options and add them in the list
     */
    fun checkForAddress()
    {
        if(address_yes_no_answer == 1)
        {
            if(passportCheckBox.isChecked == true || aadharCheckBox.isChecked ==true || voterIDCheckBox.isChecked == true || drivinglicenseCheckBox.isChecked == true)
            {

            }else{
                addressDocumentsRequired.add("Passport")
                addressDocumentsRequired.add("Aadhar")
                addressDocumentsRequired.add("Voter ID")
                addressDocumentsRequired.add("Driving License")
            }
        }
        if(address_yes_no_answer==2){

            if(rentAgreementCheckBox.isChecked==false)
            {
                addressDocumentsRequired.add("Rent Agreement")
            }
            if(electricityCheckBox.isChecked==false)
            {
                addressDocumentsRequired.add("Owner Signed Electricity Bills")
            }
        }
    }

    fun check_for_MandatoryDocuments()
    {
        if(salarySlipCheckBox.isChecked==false)
        {
            mandatoryDocumentedRequired.add("Three months salary slip")
        }
        if(bankStatementCheckBox.isChecked==false)
        {
            mandatoryDocumentedRequired.add("Six months bank statement")
        }
    }
}

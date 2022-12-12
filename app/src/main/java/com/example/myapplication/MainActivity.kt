package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.example.myapplication.R

class Personal : AppCompatActivity() {
    var gender: String? = null
    var name: String? = null
    var address: String? = null
    var email: String? = null
    var bd: String? = null
    var contact: String? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal)
        val F: EditText = findViewById(R.id.editTextTextPersonName)
        val A: EditText = findViewById(R.id.editTextTextPostalAddress)
        val C: EditText = findViewById(R.id.editTextPhone)
        val E: EditText = findViewById(R.id.editTextTextEmailAddress)
        val B: EditText = findViewById(R.id.editTextDate2)
        name = F.getText().toString()
        address = A.getText().toString()
        contact = C.getText().toString()
        email = E.getText().toString()
        bd = B.getText().toString()
    }

    fun radio(view: View) {
        val checked: Boolean = (view as RadioButton).isChecked()
        when (view.getId()) {
            R.id.radioButton3 -> if (checked) gender = "Male"
            R.id.radioButton4 -> if (checked) gender = "Female"
            R.id.radioButton5 -> if (checked) gender = "Other"
        }
    }

    fun save(view: View?) {
        if (name != null && address != null && contact != null && email != null && bd != null && gender != null) {
            if (contact != null) {
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Enter valid Number", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please fill all Details!!", Toast.LENGTH_SHORT).show()
        }
    }
}
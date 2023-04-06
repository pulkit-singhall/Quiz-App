package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bind : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.ques1.setOnClickListener{
            val alert = AlertDialog.Builder(this)
            val choices= arrayOf("Option 1","Option 2","Option 3")

            alert.setTitle("Submit Ques 1")
            alert.setIcon(R.drawable.quiz)

            alert.setSingleChoiceItems(choices,0, DialogInterface.OnClickListener { dialogInterface, i ->

            })

            alert.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Success in Ques 1",Toast.LENGTH_SHORT).show()
            })
            alert.setNegativeButton("Wait",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            alert.show()
        }

        bind.ques2.setOnClickListener{
            val alert = AlertDialog.Builder(this)
            val choices= arrayOf("Option 1","Option 2","Option 3")

            alert.setTitle("Submit Ques 2")
            alert.setIcon(R.drawable.quiz)

            alert.setSingleChoiceItems(choices,0, DialogInterface.OnClickListener { dialogInterface, i ->

            })

            alert.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Success in Ques 2",Toast.LENGTH_SHORT).show()
            })
            alert.setNegativeButton("Wait",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            alert.show()
        }

        bind.ques3.setOnClickListener{
            val alert = AlertDialog.Builder(this)
            val choices= arrayOf("Option 1","Option 2","Option 3")

            alert.setTitle("Submit Ques 3")
            alert.setIcon(R.drawable.quiz)

            alert.setMultiChoiceItems(choices,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->

            })

            alert.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Success in Ques 3",Toast.LENGTH_SHORT).show()
            })
            alert.setNegativeButton("Wait",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            alert.show()
        }

        bind.btn.setOnClickListener {
            val alert = AlertDialog.Builder(this)

            alert.setTitle("Are you sure you want to submit?")
            alert.setIcon(R.drawable.exit)
            alert.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                // quiz is submitted
                Toast.makeText(this,"Thanks for Giving the Quiz!",Toast.LENGTH_SHORT).show()
                finish()
            })

            alert.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Have Another Go",Toast.LENGTH_SHORT).show()
            })
            alert.show()
        }
    }
}
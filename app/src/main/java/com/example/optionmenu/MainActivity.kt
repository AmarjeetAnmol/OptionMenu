package com.example.optionmenu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val popupmenu =findViewById<Toolbar>(R.id.popupToolbar)
        popupmenu.setOnClickListener {
            val intent=Intent(this,PopupMenu_Activity::class.java)
            startActivity(intent)

        }


            val optionMenu=findViewById<Toolbar>(R.id.optionToolbar)
                optionMenu.setOnClickListener {
                    val intent=Intent(this,optionMenu_Activity::class.java)
                startActivity(intent)

        }

        val contextMenu =findViewById<Toolbar>(R.id.contexToolbar)
        contextMenu.setOnClickListener {
            val intent=Intent(this,context_Activity::class.java)
            startActivity(intent)

        }
    }
}
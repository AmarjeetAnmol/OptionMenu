package com.example.optionmenu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout

class PopupMenu_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)
        val background = findViewById<LinearLayout>(R.id.linearlayout)

        val popupmenubutton = findViewById<Button>(R.id.PopMenuButton)



          popupmenubutton.setOnClickListener {

            val popmenu = PopupMenu(this, popupmenubutton)

            popmenu.menuInflater.inflate(R.menu.popup_menu, popmenu.menu)
            popmenu.show()
            popmenu.setOnMenuItemClickListener{

                when(it.itemId){
                    R.id.blue ->{
                       Toast.makeText(this,"Blue",Toast.LENGTH_SHORT).show()
                        background.setBackgroundColor(Color.parseColor("#ff0000"))
                    }
                    R.id.Red ->{           Toast.makeText(this,"Red",Toast.LENGTH_SHORT).show()
                    background.setBackgroundColor(Color.parseColor("#28B463 "))
                    }
                    R.id.green ->{
                        Toast.makeText(this,"Green",Toast.LENGTH_SHORT).show()
                        background.setBackgroundColor(Color.parseColor("#ff0000"))
                    }
                }
                true
            }

        }
    }
}
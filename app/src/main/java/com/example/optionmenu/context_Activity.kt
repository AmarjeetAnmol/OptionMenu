package com.example.optionmenu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class context_Activity : AppCompatActivity() {
    lateinit var listView: ListView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        listView=findViewById(R.id.listview)
        val array=arrayOf("Ram","Lakhan","Sohan","Mantu")
        listView.adapter=ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,array)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.add(0,v!!.id,0,"Edit")

        menu?.add(0,v!!.id,0,"Update")

        menu?.add(0,v!!.id,0,"Delete")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.title){
            "Edit"->{
                Toast.makeText(this,"Edit",Toast.LENGTH_SHORT).show()
            }
            "Update"->{
                Toast.makeText(this,"Update",Toast.LENGTH_SHORT).show()
            }
            "Delete"->{
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}
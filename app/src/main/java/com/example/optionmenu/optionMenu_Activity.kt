package com.example.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class optionMenu_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
    }


      override fun onCreateOptionsMenu(menu:Menu):Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.home->{
               Toast.makeText(this,"Home", Toast.LENGTH_SHORT).show()
           }
           R.id.settings->{
               Toast.makeText(this,"settings", Toast.LENGTH_SHORT).show()
           }
           R.id.logout->{
               Toast.makeText(this,"logout", Toast.LENGTH_SHORT).show()
           }
       }

      return true
    }
}
package com.example.switchingpages

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.switchingpages.databinding.ActivityMain2Binding
import com.example.switchingpages.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var bd : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bd.root)

        bd.textView2.text= intent.getStringExtra("abcd")

    }
    override fun onResume() {
        super.onResume()
        Log.i("Mainabcd1234", "2 nd onResume: executed -  user online")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Mainabcd1234", "2 nd onPause: executed last seen on current time")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Mainabcd1234", "2 nd onDestroy: executed app closed")

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.abde,menu)
        return super.onCreateOptionsMenu(menu)
    }
}
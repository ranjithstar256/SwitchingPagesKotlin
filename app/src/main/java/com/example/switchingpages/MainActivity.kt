package com.example.switchingpages
// manifest file
// build.gradule file
/// menu
// alert dialog
// webview
// sharing data bw activities
//
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.switchingpages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bd : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bd.root)
        Log.i("Mainabcd1234", "onCreate: executed app opened")

        // india

        bd.button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("abcd", "India")
            startActivity(intent)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.abcde,menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun abt(item: MenuItem) {
        Toast.makeText(this, "abt", Toast.LENGTH_SHORT).show()

    }
    fun set(item: MenuItem){
        Toast.makeText(this, "set", Toast.LENGTH_SHORT).show()
    }

}

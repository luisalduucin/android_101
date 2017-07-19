package mx.com.lalducin.android_101

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener { _ -> startActivity(Intent(this, TripDetail::class.java)) }

        Log.d("MAIN_ACTIVITY", "OnCreate")
    }

    //TODO Override the rest of the lifecycle states and print them

}

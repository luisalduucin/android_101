package mx.com.lalducin.android_101

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener { _ -> startActivity(Intent(this, TripDetail::class.java)) }

        Log.d("MAIN_ACTIVITY", "OnCreate")
    }

    //TODO Override the rest of the lifecycle states and print them

    override fun onStart() {
        super.onStart()

        Log.d("MAIN_ACTIVITY", "OnStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("MAIN_ACTIVITY", "OnResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("MAIN_ACTIVITY", "OnPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("MAIN_ACTIVITY", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MAIN_ACTIVITY", "OnDestroy")
    }

}

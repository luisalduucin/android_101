package mx.com.lalducin.android_101

import android.os.Bundle
import android.util.Log
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LIFE_CYClE", "OnCreate")
    }

    //TODO Override the rest of the lifecycle states and print them

}

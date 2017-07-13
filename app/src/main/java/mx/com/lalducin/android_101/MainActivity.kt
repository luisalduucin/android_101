package mx.com.lalducin.android_101

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LIFE_CYCLE", "OnCreate")
    }

    // TODO
    // 1.- Override the rest of the lifecycle states and log them
    // 2.- Implement common actions on some lifecycle states

    override fun onStart() {
        super.onStart()

        Log.d("LIFE_CYCLE", "OnStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("LIFE_CYCLE", "OnResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("LIFE_CYCLE", "OnPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("LIFE_CYCLE", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("LIFE_CYCLE", "OnDestroy")
    }

}

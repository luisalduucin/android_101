package mx.com.lalducin.android_101

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_trip_detail.*

class TripDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_detail)
        setSupportActionBar(toolbar)

        Log.d("TRIP_DETAIL", "OnCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TRIP_DETAIL", "OnDestroy")
    }

}

package mx.com.lalducin.android_101

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import mx.com.lalducin.android_101.adapters.TripAdapter
import mx.com.lalducin.android_101.models.Trip
import mx.com.lalducin.android_101.utils.RandomImageURLGenerator
import java.util.Date

class MainActivity : AppCompatActivity() {

    companion object {
        val trips = mutableListOf(
                Trip(destination = "Monaco",
                        departureDate = Date().toString(),
                        budget = 200.5F,
                        destinationImage = RandomImageURLGenerator.generate(),
                        comments = "It is the most representative circuit of the F1 championship.")

                // TODO Add another initial Trip
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tripsCards.layoutManager = GridLayoutManager(this, 1)
        tripsCards.adapter = TripAdapter(trips = trips)
    }

}

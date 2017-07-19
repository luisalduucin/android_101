package mx.com.lalducin.android_101

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_trip_detail.*
import kotlinx.android.synthetic.main.content_trip_detail.*
import mx.com.lalducin.android_101.models.Trip
import mx.com.lalducin.android_101.utils.RandomImageURLGenerator

class TripDetail : AppCompatActivity() {

    private val NEW_TRIP = -1
    private var tripIndex = NEW_TRIP
    private var defaultDestinationImage = RandomImageURLGenerator.generate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_detail)
        setSupportActionBar(toolbar)

        // TODO Retrieve the value that you send via the intent
        // tripIndex =

        if (tripIndex != NEW_TRIP) {
            val trip = MainActivity.trips[tripIndex]

            with(trip) {
                destinationValue.setText(trip.destination)
                departureDateValue.setText(trip.departureDate)
                budgetValue.setText(trip.budget.toString())
                commentsValue.setText(comments)
                defaultDestinationImage = destinationImage
                Picasso.with(this@TripDetail)
                        .load(destinationImage)
                        .into(imageHeader)
            }
        }

        saveButton.setOnClickListener { _ -> saveNewTrip() }
    }

    private fun saveNewTrip() {
        val trip = Trip(
                // TODO Add the missing parameters
                destinationImage = defaultDestinationImage,
                comments = commentsValue.text.toString())

        // TODO Add or update the above trip into the trips list located in the MainActivity

        finish()
    }
}

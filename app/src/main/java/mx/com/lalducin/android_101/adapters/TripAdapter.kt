package mx.com.lalducin.android_101.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.trip_card.view.*
import mx.com.lalducin.android_101.R
import mx.com.lalducin.android_101.models.Trip


class TripAdapter(val trips: List<Trip>) : RecyclerView.Adapter<TripAdapter.TripCardHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripCardHolder {
        val inflater = LayoutInflater.from(parent.context)
        val flightCard = inflater.inflate(R.layout.trip_card, parent, false)
        return TripAdapter.TripCardHolder(flightCard)
    }

    override fun onBindViewHolder(holder: TripCardHolder, position: Int) {
        holder.bind(trips[position], position)
    }

    override fun getItemCount(): Int = trips.size

    class TripCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(trip: Trip, position: Int) {
            with(trip) {
                itemView.destinationValue.text = destination
                itemView.departureDateValue.text = departureDate
                itemView.budgetValue.text = "$ ${budget}"
                Picasso.with(itemView.context)
                        .load(destinationImage)
                        .into(itemView.destinationImage)
            }

            itemView.setOnClickListener { _ -> startTripDetailActivity(position) }
        }

        private fun startTripDetailActivity(position: Int) {
            // TODO Create an Intent, put an extra that contains the position
            itemView.context.startActivity(intent)
        }

    }

}

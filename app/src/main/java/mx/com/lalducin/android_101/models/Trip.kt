package mx.com.lalducin.android_101.models

import java.io.Serializable

class Trip(
        var destination: String,
        var departureDate: String,
        var budget: Float,
        var destinationImage: String,
        var comments: String) : Serializable
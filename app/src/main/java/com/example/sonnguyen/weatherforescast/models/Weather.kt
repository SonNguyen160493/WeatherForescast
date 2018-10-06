package com.example.sonnguyen.weatherforescast.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class Weather(var id: Int,
                   var main: String,
                   var description: String,
                   var icon: String)

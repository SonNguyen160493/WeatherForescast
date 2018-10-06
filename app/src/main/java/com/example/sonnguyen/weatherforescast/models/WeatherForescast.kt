package com.example.sonnguyen.weatherforescast.models

data class WeatherForescast(var coord: Coord,
                            var weather: List<Weather>,
                            var base: String,
                            var main: MainWeather,
                            var visibility: Int,
                            var wind: Wind,
                            var clouds: Clouds,
                            var dt: Int,
                            var sys: Sys,
                            var id: Int,
                            var name: String,
                            var cod: Int)

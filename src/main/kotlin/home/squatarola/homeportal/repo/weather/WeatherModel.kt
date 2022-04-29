package home.squatarola.homeportal.repo.weather

class WeatherModel {
    private var weatherPlace = ArrayList<WeatherPlace>()
    fun addWeatherPlace(region: String, area: String, city1: Int, city2: Int) {
        this.weatherPlace.add(
            WeatherPlace("", 0, 0)
        )
    }
}
package home.squatarola.homeportal.repo.weather

class WeatherPlace(
    area: String,
    private val city1: Int,
    private val city2: Int
) {
    // region(地方) -> area(地域・都道府県) -> city(市町村等)
    private val regionArea = WeatherModules.getArea(area)

    fun makeURL(): String {
        val baseURL = "https://tenki.jp/forecast/"
        return baseURL +
                this.regionArea?.parents + "/" +
                this.regionArea?.code + "/" +
                this.city1.toString() + "/" +
                this.city2.toString() + "/"

    }
}
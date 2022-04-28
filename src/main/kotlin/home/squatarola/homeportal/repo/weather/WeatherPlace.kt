package home.squatarola.homeportal.repo.weather

object WeatherPlace {
    interface BaseRegion {
        val name: String // 地域名
        val value: Int // 割り振られている番号
        val include: List<Int> // 内包する地域へのポインタ(空である可能性がある)
    }
    object RegionName {
        const val HOKKAIDO = 1
        const val TOHOKU = 2
        const val KANTO = 3
        const val HOKURIKU = 4
        const val TOKAI = 5
        const val KINKI = 6
        const val TYUGOKU = 7
        const val SHIKOKU = 8
        const val KYOSHU = 9
        const val OKINAWA = 10
    }
    object AreaName {
        const val DOUHOKU = 1
        const val DOUOU = 2
        const val DOUTOU = 3
        const val DOUNAN = 4
        const val AOMORI = 5
        const val IWATE = 6
        const val MIYAGI  = 7
        const val AKITA = 8
        const val YAMAGATA = 9
        const val FUKUSHIMA = 10
    }
    fun isCorrectPlace(regionCode: Int, areaCode: Int): Boolean {
        val region = this.regions.filter { it.value == regionCode }
        if (region.isEmpty()) {
            return false
        }
        return region[0].include.contains(areaCode)
    }

    private val regions: List<BaseRegion> = listOf(
        object : BaseRegion {
            override val name = "北海道"
            override val value = 1
            override val include = (1..4).toList()
        },
        object : BaseRegion {
            override val name = "東北"
            override val value = 2
            override val include = (5..10).toList()
        },
        object : BaseRegion {
            override val name = "関東"
            override val value = 1
            override val include = (11..17).toList()
        },
        object : BaseRegion {
            override val name = "北陸"
            override val value = 1
            override val include = (18..21).toList()
        },
        object : BaseRegion {
            override val name = "中部"
            override val value = 1
            override val include = (22..27).toList()
        },
        object : BaseRegion {
            override val name = "近畿"
            override val value = 1
            override val include = (28..33).toList()
        },
        object : BaseRegion {
            override val name = "中国"
            override val value = 1
            override val include = (34..38).toList()
        },
        object : BaseRegion {
            override val name = "四国"
            override val value = 1
            override val include = (39..42).toList()
        },
        object : BaseRegion {
            override val name = "九州"
            override val value = 9
            override val include = (43..49).toList()
        },
        object : BaseRegion {
            override val name = "沖縄"
            override val value = 10
            override val include = listOf(50)
        },
    )
    fun getRegion(num: Int): BaseRegion? {
        val regions = this.regions.filter { it.value == num }
        return if (regions.isNotEmpty()) regions[0] else null
    }
    fun getRegion(name: String): BaseRegion? {
        val regions = this.regions.filter { it.name == name }
        return if (regions.isNotEmpty()) regions[0] else null
    }

    private val areas: List<BaseRegion> = listOf(
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道央"
            override val value = 2
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道東"
            override val value = 3
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道南"
            override val value = 4
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "青森"
            override val value = 5
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "岩手"
            override val value = 6
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "宮城"
            override val value = 7
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "秋田"
            override val value = 8
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "山形"
            override val value = 9
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "福島"
            override val value = 10
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
        object : BaseRegion {
            override val name = "道北"
            override val value = 1
            override val include = listOf<Int>()
        },
    )
    fun getArea(num: Int): BaseRegion? {
        val areas = this.areas.filter { it.value == num }
        return if (areas.isNotEmpty()) areas[0] else null
    }
    fun getArea(name: String): BaseRegion? {
        val areas = this.areas.filter { it.name == name }
        return if (areas.isNotEmpty()) areas[0] else null
    }
}
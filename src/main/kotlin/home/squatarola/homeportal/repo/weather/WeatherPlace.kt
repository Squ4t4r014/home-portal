package home.squatarola.homeportal.repo.weather

object WeatherPlace {
    // region(地方) -> area(地域・都道府県) -> city(市町村等)
    interface BasePlace {
        val name: String // 地域名
        val code: Int // 割り振られている番号
        val parents: Int? //この地域が所属する地域
        val children: List<Int> // 内包する地域へのポインタ(空である可能性がある)
    }
    fun isCorrectPlace(regionCode: Int, areaCode: Int): Boolean {
        val region = this.regions.filter { it.code == regionCode }
        if (region.isEmpty()) {
            return false
        }
        return region[0].children.contains(areaCode)
    }

    private val regions by lazy { createRegion() }
    fun getRegion(num: Int): BasePlace? {
        val regions = this.regions.filter { it.code == num }
        return if (regions.isNotEmpty()) regions[0] else null
    }
    fun getRegion(name: String): BasePlace? {
        val regions = this.regions.filter { it.name == name }
        return if (regions.isNotEmpty()) regions[0] else null
    }
    private fun createRegion(): List<BasePlace> {
        fun searchChildrenAreas(regionCode: Int): List<Int> =
            when (regionCode) {
                1 -> (1..4).toList()
                2 -> (5..10).toList()
                3 -> (11..17).toList() + (22..23).toList()
                4 -> (18..21).toList()
                5 -> (22..27).toList()
                6 -> (28..33).toList()
                7 -> (34..38).toList()
                8 -> (39..42).toList()
                9 -> (43..49 ).toList()
                10 -> listOf(50)
                else -> listOf()
            }

        val regionNames = listOf(
            "北海道",
            "東北",
            "関東",
            "北陸",
            "中部",
            "近畿",
            "中国",
            "四国",
            "九州",
            "沖縄",
        )
        val regions = ArrayList<BasePlace>()
        for (i in 1..10) {
            regions.add(
                object : BasePlace {
                    override val name = regionNames[i - 1]
                    override val code = i
                    override val parents = null
                    override val children = searchChildrenAreas(i)
                }
            )
        }
        return regions
    }

    private val areas by lazy { createAreas() }
    fun getArea(num: Int): BasePlace? {
        val areas = this.areas.filter { it.code == num }
        return if (areas.isNotEmpty()) areas[0] else null
    }
    fun getArea(name: String): BasePlace? {
        val areas = this.areas.filter { it.name == name }
        return if (areas.isNotEmpty()) areas[0] else null
    }
    private fun createAreas(): List<BasePlace> {
        fun searchParentRegion(areaCode: Int): Int? =
            when (areaCode) {
                in 1..4 -> 1
                in 5..10 -> 2
                in 11..17, in 22..23 -> 3
                in 18..21 -> 4
                in 24..27 -> 5
                in 28..33 -> 6
                in 34..38 -> 7
                in 39..42 -> 8
                in 43..49 -> 9
                50 -> 10
                else -> null
            }

        val areaNames = listOf(
            "道北",
            "道央",
            "道東",
            "道南",
            "青森",
            "岩手",
            "宮城",
            "秋田",
            "山形",
            "福島",
            "茨城",
            "栃木",
            "群馬",
            "埼玉",
            "千葉",
            "東京",
            "神奈川",
            "山梨",
            "長野",
            "新潟",
            "富山",
            "石川",
            "福井",
            "岐阜",
            "静岡",
            "愛知",
            "三重",
            "滋賀",
            "京都",
            "大阪",
            "兵庫",
            "奈良",
            "和歌山",
            "鳥取",
            "島根",
            "岡山",
            "広島",
            "山口",
            "徳島",
            "香川",
            "愛媛",
            "高知",
            "福岡",
            "佐賀",
            "長崎",
            "熊本",
            "大分",
            "宮崎",
            "鹿児島",
            "沖縄",
            )
        val areas = ArrayList<BasePlace>()
        for (i in 1..50) {
            areas.add(
                object : BasePlace {
                    override val name = areaNames[i - 1]
                    override val code = i
                    override val parents = searchParentRegion(i)
                    override val children = listOf<Int>()
                    //TODO("Not yet implemented")
                }
            )
        }
        return areas.toList()
    }

    private val cities by lazy { createCities() }
    fun getCity(num: Int): BasePlace? {
        val areas = this.areas.filter { it.code == num }
        return if (areas.isNotEmpty()) areas[0] else null
    }
    fun getCity(name: String): BasePlace? {
        val areas = this.areas.filter { it.name == name }
        return if (areas.isNotEmpty()) areas[0] else null
    }
    private fun createCities(): List<BasePlace> {
        class City(
            name: String,
            first: Int,
            second: Int
        )

        fun searchParentRegion(areaCode: Int): Int? =
            when (areaCode) {
                in 1..4 -> 1
                in 5..10 -> 2
                in 11..17, in 22..23 -> 3
                in 18..21 -> 4
                in 24..27 -> 5
                in 28..33 -> 6
                in 34..38 -> 7
                in 39..42 -> 8
                in 43..49 -> 9
                50 -> 10
                else -> null
            }

        val cities = listOf<City>(
            City("稚内", 1100, 1214),
            City("猿払", 1100, 1511),
            City("浜頓別", 1100, 1512),
            City("中頓別", 1100, 1213),
            City("枝幸", 1100, 1514),
            City("豊富", 1100, 1216),
            City("礼文", 1100, 1517),
            City("利尻", 1100, 1218),
            City("利尻富士", 1100, 1519),
            City("幌別", 1100, 1220),

        )
        val areas = ArrayList<BasePlace>()
        for (i in 1..50) {
            areas.add(
                object : BasePlace {
                    override val name = cit[i - 1]
                    override val code = i
                    override val parents = searchParentRegion(i)
                    override val children = listOf<Int>()
                    //TODO("Not yet implemented")
                }
            )
        }
        return areas.toList()
    }
}
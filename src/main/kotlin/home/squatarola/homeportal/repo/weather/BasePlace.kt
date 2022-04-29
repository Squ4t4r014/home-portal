package home.squatarola.homeportal.repo.weather

interface BasePlace {
    val name: String // 地域名
    val code: Int // 割り振られている番号
    val parents: Int? //この地域が所属する地域
    val children: List<Int> // 内包する地域へのポインタ(空である可能性がある)

    fun getParent(): BasePlace?
}
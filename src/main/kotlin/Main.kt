import WallService.posts
fun main() {

    val comment = Comments(1, true, true, true, true)
    val copyright = Copyright(1, " ", " ", " ")
    val like = Likes(1, true, true, true)
    val repost = Reposts(1, true)
    val view = Views(1)
    val donut = Donut(true, 1, " ", false, " ")
    val attachments = null

    WallService.add(
        Post(
            0, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, comment, copyright, like, repost, view,
            " ", 15, true, false, true, false,
            false, donut, 12, attachments)
    )

    println(WallService.add(posts.last()))
}



import WallService.posts

fun main() {

    WallService.add(
        Post(0, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, "bla", 15, false, true, false,
            true, false, 4563))

    println(WallService.add(posts.last()))

    WallService.add(
        Post(2, 3, 4152, 4, 13022022, "lala", 53,
            46, true, "bla", 15, false, true, false,
            true, false, 4563))

    println(WallService.add(posts.last()))
}
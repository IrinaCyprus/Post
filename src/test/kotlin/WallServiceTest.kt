import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    //    @Before
//    fun setUp(){
//    }
//    @After
//    fun tearDown(){
//        WallService.clear()
//    }
    @Test
    fun addTest() {
        //arrange
        val examplePost = Post(0, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null)
        val expected = 1
        //act
        val result = WallService.add(examplePost).id
        //assert
        assertEquals(expected, result)
    }

    @Test
    fun updateTestTrue() {
        val service = WallService
        service.add(Post(1, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null))

        val update = Post(1, 2, 4152, 4, 13022022, "xaxaxa", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null)

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateTestFalse() {
        val service = WallService
        service.add(Post(1, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null))

        val update = Post(5, 2, 4152, 4, 13022022, "xaxaxa", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null)

        val result = service.update(update)

        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService
        service.add(Post(100, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null))

        val comment = Comment(100, 2, 3, 4, "траляля", null, true, "",
            1, 2, null, null, null)

        WallService.createComment(comment)

    }

    @Test(expected = PostNotFoundException::class)
    fun shouldNotThrow() {
        val service = WallService
        service.add(Post(100, 2, 4152, 4, 13022022, "blablabla", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12, attachments = null))

        val comment = Comment(99, 2, 3, 4, "траляля", null, true, "",
            1, 2, null, null, null)

        WallService.createComment(comment)
    }
}
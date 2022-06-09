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
                false, " "), 12)
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
                false, " "), 12))

        val update = Post(1, 2, 4152, 4, 13022022, "xaxaxa", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12)

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
                false, " "), 12))

        val update = Post(5, 2, 4152, 4, 13022022, "xaxaxa", 53,
            46, true, Comments(1, true, true, true, true),
            Copyright(1, " ", " ", " "), Likes(1, true, true, true),
            Reposts(1, true), Views(1), " ", 15, true, false,
            true, false, false, Donut(true, 1, " ",
                false, " "), 12)

        val result = service.update(update)

        assertFalse(result)
    }
}
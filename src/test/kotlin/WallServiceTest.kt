
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
        val examplePost = Post(0, 2, 4152, 4, 13022022, text = "blabbed", 53,
            46, true, "bla", 15, canPin = false, canEdit = true, isPinned = false,
            markedAsAd = true, isFavorite = false, postponedId = 4563)
        val expected = 1
        //act
        val result = WallService.add(examplePost).id
        //assert
        assertEquals(expected, result)
    }

    @Test
    fun updateTestTrue() {
        val service = WallService
        service.add(Post(1, 2, 4152, 4, 13022022, "bla-bla-bla", 53,
            46, true, "bla", 15, canPin = false, canEdit = true, isPinned = false,
            markedAsAd = true, isFavorite = false, postponedId = 4563))

        val update = Post(1, 2, 4152, 4, 13022022, "xa-xa-xa", 53,
            46, true, "bla", 15, canPin = false, canEdit = true, isPinned = false,
            markedAsAd = true, isFavorite = false, postponedId = 4563)

        val result = service.update(update)

        assertTrue(result)
    }
    @Test
    fun updateTestFalse() {
        val service = WallService
        service.add(Post(1, 2, 4152, 4, 13022022, "bla-bla-bla", 53,
            46, true, "bla", 15, canPin = false, canEdit = true, isPinned = false,
            markedAsAd = true, isFavorite = false, postponedId = 4563))

        val update = Post(5, 2, 4152, 4, 13022022, "xa-xa-xa", 53,
            46, true, "bla", 15, canPin = false, canEdit = true, isPinned = false,
            markedAsAd = true, isFavorite = false, postponedId = 4563)

        val result = service.update(update)

        assertFalse(result)
    }
}
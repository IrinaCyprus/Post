data class EventAttachments(
    val id: Int,
    val time: Int,
    val member_status: Int
)

class Event : Attachments("event") {
     fun get(): EventAttachments {
        val event1 = EventAttachments(1, 2, 3)
        return event1
    }

//    fun get(): EventAttachments {
//        return EventAttachments(1, 2, 3)
//    }

    override fun printType() {
        println(type)
        println(get())
    }
}
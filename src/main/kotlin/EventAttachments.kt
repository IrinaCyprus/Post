data class Event(
    val id: Int,
    val time: Int,
    val member_status: Int
)

class EventAttachments : Attachments("event") {
    override fun get(): Event {
        return Event(1, 2, 3)
    }

}
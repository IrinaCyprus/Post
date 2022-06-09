data class Graffiti(
    val id: Int,
    val owner_id: Int,
    val photo_130: String,
    val photo_604: String
)

class GraffitiAttachments : Attachments("graffiti") {
    override fun get(): Graffiti {
        return Graffiti(10, 2, "gif_130", "gif_604")
    }

}
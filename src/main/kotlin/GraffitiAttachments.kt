data class GraffitiAttachments(
    val id: Int,
    val owner_id: Int,
    val photo_130: String,
    val photo_604: String
)

class Graffiti : Attachments("graffiti") {
    fun get(): GraffitiAttachments {
        return GraffitiAttachments(10, 2, "gif_130", "gif_604")
    }

    override fun printType() {
        println(type)
        println(get())
    }
}
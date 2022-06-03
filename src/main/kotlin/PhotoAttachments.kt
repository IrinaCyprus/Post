data class PhotoAttachments(
    val photo: String,
    val post_id: Int
)

class Photo : Attachments("photo") {
    fun get(): PhotoAttachments {
        return PhotoAttachments("jpeg", 2)
    }

    override fun printType() {
        println(type)
        println(get())
    }
}

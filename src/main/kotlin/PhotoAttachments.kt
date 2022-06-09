data class Photo(
    val photo: String,
    val post_id: Int
)

class PhotoAttachments : Attachments("photo") {
    override fun get(): Photo {
        return Photo("jpeg", 2)
    }

}
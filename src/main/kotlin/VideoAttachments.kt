data class Video(
    val video: String
)

class VideoAttachments : Attachments("video") {
    override fun get(): Video {
        return Video("HD")
    }

}

data class Audio(
    val audio: String
)

class AudioAttachments(val audio: Audio) : Attachments("audio") {
    override fun get(): Audio {
        return Audio("mp4")
    }

}
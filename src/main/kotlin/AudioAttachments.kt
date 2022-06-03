data class AudioAttachments(
    val audio: String
)

class Audio : Attachments("audio") {
    fun get(): AudioAttachments {
        return AudioAttachments("mp4")
    }

    override fun printType() {
        println(type)
        println(get())
    }
}
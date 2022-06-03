data class VideoAttachments(
    val video: String
)

class Video : Attachments("video") {
fun get(): VideoAttachments {
    return VideoAttachments("HD")
}

override fun printType() {
    println(type)
    println(get())
}
}

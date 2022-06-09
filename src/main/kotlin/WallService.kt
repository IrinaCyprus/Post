object WallService {

    var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var postId = 0

    fun add(post: Post): Post {
        postId++
        val addPost = post.copy(id = postId)
        posts += addPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
            } else {
                throw PostNotFoundException()
            }
        }
    }
}
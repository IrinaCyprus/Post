object WallService {
    var posts = emptyArray<Post>()
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

//    fun clear(){
//        posts.run { clear() }
//    }
}
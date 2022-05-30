//class Person(val pets: MutableList<Pet> = MutableList())
//
//class Pet {
//    constructor(owner: Person) {
//        owner.pets.add(this) // adds this pet to the list of its owner's pets
//    }
//}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
//    val comments: Comments,
//    val copyright: Copyright,
//    val likes: Likes,
//    val reposts: Reposts,
//    val views: Views,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAd: Boolean,
    val isFavorite: Boolean,
//    val donut: Donut,
    val postponedId: Int
)

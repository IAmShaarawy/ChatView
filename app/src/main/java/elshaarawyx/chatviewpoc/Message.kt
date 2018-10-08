package elshaarawyx.chatviewpoc


data class Message(val id: String,
                   val msg: String,
                   val date: String,
                   val avatar: String,
                   val isUser: Boolean = true)
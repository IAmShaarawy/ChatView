package elshaarawyx.chatviewpoc

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class DialogAdapter(private val messages: MutableList<Message>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    init {
        messages.sortByDescending { it.id.toLong() }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_USER -> UserViewHolder(layoutInflater.inflate(R.layout.item_user_chat_message, parent, false))
            TYPE_PEER -> PeerViewHolder(layoutInflater.inflate(R.layout.item_peer_chat_message, parent, false))
            else -> throw IllegalStateException("$viewType is Illegal ViewType ")
        }
    }

    override fun getItemCount(): Int = messages.size

    override fun getItemViewType(position: Int): Int = messages[position].isUser.let {
        if (it) TYPE_USER else TYPE_PEER
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = messages[position]
        val isNextMessageForMe = if (messages.firstOrNull() == message) false
        else !(message.isUser xor messages[position - 1].isUser)
        when (holder) {
            is UserViewHolder -> holder.bind(message, isNextMessageForMe)
            is PeerViewHolder -> holder.bind(message, isNextMessageForMe)
            else -> throw IllegalStateException("$holder is Illegal Holder")
        }
    }

    companion object {
        private const val TYPE_USER = 1
        private const val TYPE_PEER = 2
    }
}
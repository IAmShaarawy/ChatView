package elshaarawyx.chatviewpoc

import android.animation.LayoutTransition
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_peer_chat_message.view.*

/**
 * Created by elshaarawy on 10/7/18.
 */
class PeerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    init {
        itemView.apply {
            tvPeerTextMessage.setOnClickListener {
                tvPeerMessageDate.swapVisibility()
            }
        }
    }

    fun bind(message: Message, nextMessageForMe: Boolean) {
        itemView.apply {
            tvPeerTextMessage.text = message.msg
            tvPeerMessageDate.text = message.date
            if (!nextMessageForMe)
                imgPeerAvatar loadAsRounded message.avatar
        }
    }
}


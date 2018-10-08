package elshaarawyx.chatviewpoc

import android.animation.LayoutTransition
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_user_chat_message.view.*


class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    init {
        itemView.apply {
            tvUserTextMessage.setOnClickListener {
                tvUserMessageDate.swapVisibility()
            }
        }.let { it as ViewGroup }.apply {
            layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        }
    }

    fun bind(message: Message, nextMessageForMe: Boolean) {
        itemView.apply {
            tvUserTextMessage.text = message.msg
            tvUserMessageDate.text = message.date
            if (!nextMessageForMe)
                imgUserAvatar loadAsRounded message.avatar
        }
    }
}
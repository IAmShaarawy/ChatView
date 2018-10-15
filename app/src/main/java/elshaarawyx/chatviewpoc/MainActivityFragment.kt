package elshaarawyx.chatviewpoc

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_main, container, false).apply {
                rvChatDialog.apply {
                    layoutManager = LinearLayoutManager(this@MainActivityFragment.context,
                            LinearLayoutManager.VERTICAL, true)
                    adapter = DialogAdapter(makeDialog())
                }
            }

    private fun makeDialog(): MutableList<Message> {
        val peerAvatar = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Nasser_portrait2.jpg/280px-Nasser_portrait2.jpg"
        val userAvatar = "https://abjjadst.blob.core.windows.net/pub/1c3b17b5-0b0c-4341-8cdb-34cf384cc2a0.png"
        return mutableListOf(
                Message("0", "Hello !", "09:13PM", userAvatar),
                Message("1", "How Are You?", "09:14PM", userAvatar),
                Message("2", "Hi There", "09:15PM", peerAvatar, false),
                Message("3", "How is the business?", "09:16PM", userAvatar),
                Message("4", "I'm Fine,", "09:17PM", peerAvatar, false),
                Message("5", "but still losing 😥", "09:17PM", peerAvatar, false),
                Message("6", "ربنا معاك يا حبيبي و يخدك علشان امسك مكانك", "09:18PM", userAvatar),
                Message("7", "😂 🤣", "09:18PM", userAvatar),
                Message("8", "هوصي الولد خالد الإسلامبولي يعمل معاك الواجب 😉", "09:19PM", peerAvatar, false),
                Message("9", "Hello !", "09:13PM", userAvatar),
                Message("10", "How Are You?", "09:14PM", userAvatar),
                Message("11", "Hi There", "09:15PM", peerAvatar, false),
                Message("12", "How is the business?", "09:16PM", userAvatar),
                Message("13", "I'm Fine,", "09:17PM", peerAvatar, false),
                Message("14", "but still losing 😥", "09:17PM", peerAvatar, false),
                Message("15", "ربنا معاك يا حبيبي و يخدك علشان امسك مكانك", "09:18PM", userAvatar),
                Message("16", "😂 🤣", "09:18PM", userAvatar),
                Message("17", "هوصي الولد خالد الإسلامبولي يعمل معاك الواجب 😉", "09:19PM", peerAvatar, false),
                Message("18", "Hello !", "09:13PM", userAvatar),
                Message("19", "How Are You?", "09:14PM", userAvatar),
                Message("20", "Hi There", "09:15PM", peerAvatar, false),
                Message("21", "How is the business?", "09:16PM", userAvatar),
                Message("22", "I'm Fine,", "09:17PM", peerAvatar, false),
                Message("23", "but still losing 😥", "09:17PM", peerAvatar, false),
                Message("24", "ربنا معاك يا حبيبي و يخدك علشان امسك مكانك", "09:18PM", userAvatar),
                Message("25", "😂 🤣", "09:18PM", userAvatar),
                Message("26", "هوصي الولد خالد الإسلامبولي يعمل معاك الواجب 😉", "09:19PM", peerAvatar, false)
        )
    }
}

package elshaarawyx.chatviewpoc

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.request.RequestOptions


fun View.swapVisibility() {
    visibility = if (visibility != View.VISIBLE)
        View.VISIBLE
    else
        View.GONE
}

infix fun ImageView.loadAsRounded(url: String) {
    Glide.with(this)
            .load(url)
            .apply(RequestOptions.circleCropTransform())
            .into(this)
}

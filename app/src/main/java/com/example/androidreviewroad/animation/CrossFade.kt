package com.example.androidreviewroad.animation

import android.view.View

object CrossFade {

    fun crossFade(view: View, AnimationDuration: Int) {
        view.visibility = View.GONE
        view.apply {
            alpha = 0f
            visibility = View.VISIBLE

            animate()
                .alpha(1f)
                .setDuration(AnimationDuration.toLong())
                .setListener(null)
        }
    }
}

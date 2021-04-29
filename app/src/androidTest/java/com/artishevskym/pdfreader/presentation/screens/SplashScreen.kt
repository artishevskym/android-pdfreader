package com.artishevskym.pdfreader.presentation.screens

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KTextView
import com.artishevskym.pdfreader.R
import com.artishevskym.pdfreader.presentation.SplashActivity
import com.kaspersky.kaspresso.screens.KScreen

object SplashScreen : KScreen<SplashScreen>() {
    override val layoutId: Int = R.layout.splash_activity
    override val viewClass: Class<*> = SplashActivity::class.java

    val logo = KImageView { withId(R.id.ivLogo) }
    val title = KTextView { withId(R.id.tvTitle) }
}
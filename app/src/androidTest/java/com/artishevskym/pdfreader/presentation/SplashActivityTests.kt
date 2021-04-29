package com.artishevskym.pdfreader.presentation

import android.Manifest
import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import com.artishevskym.pdfreader.R
import com.artishevskym.pdfreader.presentation.screens.SplashScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class SplashActivityTests : TestCase() {

    @get:Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    @get:Rule
    val activityTestRule = ActivityTestRule(SplashActivity::class.java, true, false)

    @Test
    fun testSplashScreenHasLogoAndTitle() = run {
        step("Open Splash screen") {
            activityTestRule.launchActivity(null)
            device.screenshots.take("SplashScreen_screenshot") // stored at: /storage/emulated/0/screenshots/run_1/com.artishevskym.pdfreader.presentation.SplashActivityTests/testSplashScreenShowsLogoAndTitle/SplashScreen_screenshot.png
        }

        step("Check logo") {
            SplashScreen {
                logo.isVisible()
                logo.hasDrawable(R.mipmap.ic_launcher_round)
            }
        }

        step("Check title") {
            SplashScreen {
                title.isVisible()
                title.hasText(R.string.app_name)
            }
        }
    }
}
package hu.autsoft.krate.moshi.util

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry

val targetContext: Context
    get() = InstrumentationRegistry.getInstrumentation().targetContext

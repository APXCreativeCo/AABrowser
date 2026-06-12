package com.kododake.aabrowser.analytics

import android.content.Context

class UmamiTracker(@Suppress("UNUSED_PARAMETER") context: Context) {
    fun trackEvent(@Suppress("UNUSED_PARAMETER") eventName: String, @Suppress("UNUSED_PARAMETER") eventData: Map<String, String>? = null) = Unit
}
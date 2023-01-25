package com.github.instagram4j.instagram4j.utils

import java.nio.charset.StandardCharsets
import java.util.*

object Base64Helper {
        fun decode(value: String): ByteArray {
            return if (android.os.Build.VERSION.SDK_INT <= 24) {
                android.util.Base64.decode(value, 0)
            } else {
                java .util.Base64.getDecoder().decode(value)
            }
        }

    fun encode(value: ByteArray): String {
        return if (android.os.Build.VERSION.SDK_INT <= 24) {
            android.util.Base64.encodeToString(value, 0)
        } else {
            java .util.Base64.getEncoder().encodeToString(value)
        }
    }
}
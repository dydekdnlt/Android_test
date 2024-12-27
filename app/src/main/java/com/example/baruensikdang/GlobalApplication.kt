package com.example.baruensikdang

import android.app.Application
import com.kakao.sdk.common.KakaoSdk


class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this, "109c570c826e0159565dd5cc4253571b")
    }
}
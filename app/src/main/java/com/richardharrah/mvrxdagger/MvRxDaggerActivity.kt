package com.richardharrah.mvrxdagger

import android.os.Bundle
import com.airbnb.mvrx.BaseMvRxActivity

class MvRxDaggerActivity : BaseMvRxActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvrxdagger)
    }
}
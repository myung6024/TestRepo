package com.example.diffutiltest

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialog
import kotlinx.android.synthetic.main.dialog_loading.*
import org.koin.dsl.module

// just declare it
val myModule = module {
    single { (activity: AppCompatActivity, message: String?) ->
        AppCompatDialog(activity)
            .apply {
                setCancelable(false)
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                setContentView(R.layout.dialog_loading)
                tv_pregress_message.text = message ?: "잠시만 기다려주세요."
            }
    }
}
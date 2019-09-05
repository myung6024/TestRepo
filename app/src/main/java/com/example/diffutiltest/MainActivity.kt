package com.example.diffutiltest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.appcompat.app.AppCompatDialog
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

data class MainData(val title:String, val content:String)

class MainActivity : AppCompatActivity() {

    private val dialog: AppCompatDialog by inject { parametersOf(this@MainActivity, "안녕") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coordinatorlayout)

        rv_main_list.adapter = MainAdapter()
        rv_main_list.layoutManager = LinearLayoutManager(this)
    }
}

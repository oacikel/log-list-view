package com.oacikel.loglistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oacikel.loglistview.logViewComponent.model.LogModel

class MainActivity : AppCompatActivity() {
    var logs:ArrayList<LogModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.oacikel.loglistview.logViewComponent

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oacikel.loglistview.MainActivity
import com.oacikel.loglistview.logViewComponent.adapter.LogAdapter
import com.oacikel.loglistview.logViewComponent.constants.eLogType
import com.oacikel.loglistview.logViewComponent.model.LogModel

open class LogView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
) : RecyclerView(context, attrs) {
    private lateinit var adapter: LogAdapter

    fun init() {
        layoutManager = LinearLayoutManager(context)
        if (context is MainActivity){
            adapter = LogAdapter((context as MainActivity).logs)
        }else{
            throw Exception("Context is not in main activity")
        }
        setLogAdapter()
    }

    private fun setLogAdapter() {
        setAdapter(adapter)
    }

    fun d(content:String){
        (context as MainActivity).logs.add(LogModel(eLogType.d,content))
        adapter.update((context as MainActivity).logs)
        Log.d("LogViewLog",content)
    }

    fun e(content:String){
        (context as MainActivity).logs.add(LogModel(eLogType.e,content))
        adapter.update((context as MainActivity).logs)
        Log.e("LogViewLog",content)
    }

    fun w(content:String){
        (context as MainActivity).logs.add(LogModel(eLogType.w,content))
        adapter.update((context as MainActivity).logs)
        Log.w("LogViewLog",content)
    }

    fun i(content:String){
        (context as MainActivity).logs.add(LogModel(eLogType.i,content))
        adapter.update((context as MainActivity).logs)
        Log.i("LogViewLog",content)
    }

    fun wtf(content:String){
        (context as MainActivity).logs.add(LogModel(eLogType.wtf,content))
        adapter.update((context as MainActivity).logs)
        Log.wtf("LogViewLog",content)
    }

}
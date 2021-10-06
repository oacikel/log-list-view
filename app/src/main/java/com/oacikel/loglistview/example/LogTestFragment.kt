package com.oacikel.loglistview.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.oacikel.loglistview.R
import com.oacikel.loglistview.logViewComponent.constants.eLogType
import com.oacikel.loglistview.logViewComponent.model.LogModel
import com.oacikel.loglistview.logViewComponent.LogView


class LogTestFragment : Fragment() {
    var logArray: ArrayList<LogModel> = arrayListOf()
    lateinit var logView: LogView
    var index=1
    val arrayLogTypes:ArrayList<eLogType> = arrayListOf(
        eLogType.d,
        eLogType.e,
        eLogType.i,
        eLogType.w,
        eLogType.wtf)
    companion object {

        fun newInstance(): LogTestFragment {

            return LogTestFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_log_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    fun init(view:View) {
        logView = view.findViewById<LogView>(R.id.logView)
        logView.init()
        val logButton = view.findViewById<Button>(R.id.buttonLog)

        logButton?.setOnClickListener() {
            generateNewLog()
        }
    }

    fun generateNewLog() {
        if(index==5){
            index=0
        }
        when(arrayLogTypes[index]){
            eLogType.d -> logView.d("Current millisecond is" + System.currentTimeMillis().toString())
            eLogType.w -> logView.w("Current millisecond is" + System.currentTimeMillis().toString())
            eLogType.i -> logView.i("Current millisecond is" + System.currentTimeMillis().toString())
            eLogType.e -> logView.e("Current millisecond is" + System.currentTimeMillis().toString())
            eLogType.wtf -> logView.wtf("Current millisecond is" + System.currentTimeMillis().toString())
        }
        index++
    }

}

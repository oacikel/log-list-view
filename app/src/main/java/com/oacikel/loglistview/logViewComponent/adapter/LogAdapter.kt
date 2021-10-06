package com.oacikel.loglistview.logViewComponent.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oacikel.loglistview.databinding.ItemLogBinding
import com.oacikel.loglistview.logViewComponent.model.LogModel

class LogAdapter(private var logList: ArrayList<LogModel>) :
    RecyclerView.Adapter<LogAdapter.LogHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): LogHolder {
        val itemBinding =
            ItemLogBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return LogHolder(itemBinding)
    }

    override fun onBindViewHolder(viewHolder: LogHolder, position: Int) {
        val log: LogModel = logList[position]
        viewHolder.bind(log)
    }

    override fun getItemCount() = logList.size

    class LogHolder(private val itemBinding: ItemLogBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(log: LogModel) {
            itemBinding.logModel = log
        }
    }

    fun update(logs: ArrayList<LogModel>) {
        logList = logs
        notifyDataSetChanged()
    }

}
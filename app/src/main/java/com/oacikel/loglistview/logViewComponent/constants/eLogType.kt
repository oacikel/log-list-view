package com.oacikel.loglistview.logViewComponent.constants

import com.oacikel.loglistview.R

enum class eLogType(var type: String,var color: Int){

    d("d", R.color.debug_color),
    w("d", R.color.warning_color),
    i("d", R.color.info_color),
    e("d", R.color.error_color),
    wtf("d", R.color.wtf_color),
}
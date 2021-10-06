package com.oacikel.loglistview.logViewComponent.model

import com.oacikel.loglistview.logViewComponent.constants.eLogType

data class LogModel(
    val logType: eLogType,
    val content: String
)
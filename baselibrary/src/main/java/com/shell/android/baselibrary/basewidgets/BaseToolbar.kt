package com.shell.android.baselibrary.basewidgets

import android.support.v7.widget.Toolbar

interface BaseToolbar {

    fun loadToolbar(toolbar: Toolbar?)
    fun displayHomeEnabled(enabled: Boolean)
}
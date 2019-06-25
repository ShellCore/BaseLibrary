package com.shell.android.baselibrary.basewidgets

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

open class BaseToolbarImpl : AppCompatActivity(), BaseToolbar {

    var _toolbar : Toolbar? = null

    override fun loadToolbar(toolbar: Toolbar?) {
        _toolbar = toolbar
        _toolbar.let {
            setSupportActionBar(_toolbar)
        }
        supportActionBar?.apply {
            setDisplayShowHomeEnabled(true)
            setHomeButtonEnabled(true)
        }
    }

    override fun displayHomeEnabled(enabled: Boolean) {
        supportActionBar?.apply {
            setDisplayShowHomeEnabled(enabled)
        }
    }
}
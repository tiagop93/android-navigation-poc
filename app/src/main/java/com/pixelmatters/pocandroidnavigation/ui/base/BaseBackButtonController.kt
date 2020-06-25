package com.pixelmatters.pocandroidnavigation.ui.base

import android.R.id.home
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.pixelmatters.pocandroidnavigation.common.utils.popCurrentController

abstract class BaseBackButtonController : BaseController {

    protected open val isSetBackButton = true

    constructor()
    constructor(args: Bundle) : super(args)

    init {
        retainViewMode = RetainViewMode.RETAIN_DETACH
        setHasOptionsMenu(true)
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        if(isSetBackButton) setBackButton()
    }

    protected fun setBackButton() {
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            home -> {
                goBack()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    protected open fun goBack() {
        popCurrentController()
    }
}

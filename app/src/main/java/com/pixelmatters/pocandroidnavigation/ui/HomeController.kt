package com.pixelmatters.pocandroidnavigation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pixelmatters.pocandroidnavigation.R
import com.pixelmatters.pocandroidnavigation.ui.base.BaseController
import com.pixelmatters.pocandroidnavigation.common.utils.pushController
import kotlinx.android.synthetic.main.controller_home.view.*

class HomeController: BaseController() {

    override val title: String
        get() = "Home Controller"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        var view = inflater.inflate(R.layout.controller_home, container, false)

        view.button_details.setOnClickListener { pushController(DetailsController()) }
        return view
    }

}
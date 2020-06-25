package com.pixelmatters.pocandroidnavigation.ui

import android.view.*
import com.pixelmatters.pocandroidnavigation.R
import com.pixelmatters.pocandroidnavigation.ui.base.BaseBackButtonController
import com.pixelmatters.pocandroidnavigation.common.utils.popToRoot
import com.pixelmatters.pocandroidnavigation.common.utils.pushController
import kotlinx.android.synthetic.main.controller_details.view.*

class DetailsController: BaseBackButtonController() {

    override val title: String
        get() = "Details Controller"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        var view = inflater.inflate(R.layout.controller_details,container,false)

        view.button_go_back.setOnClickListener { goBack()}
        view.button_details.setOnClickListener { pushController(DetailsController())}
        view.button_root.setOnClickListener { popToRoot()}
        return view
    }

}
package com.assignmentwzd.fetchcoronadetails.ui.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class CountriesAdapter(
    context: Context,
    resource: Int,
    textViewResourceId: Int,
    objects: MutableList<String>
) : ArrayAdapter<String>(context, resource, textViewResourceId, objects) {
         var values = objects
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var str= values[position].split(",")
        return super.getView(position, convertView, parent)
    }
}



package com.assignmentwzd.fetchcoronadetails.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.assignmentwzd.fetchcoronadetails.R
import com.assignmentwzd.fetchcoronadetails.data.model.Country
import com.assignmentwzd.fetchcoronadetails.data.model.RequiredData
import com.assignmentwzd.fetchcoronadetails.databinding.ListItemBinding

//private val list: List<Global> ?
class CoronaVirusUpdateAdapter constructor(var data:List<Country>): RecyclerView.Adapter<CoronaVirusUpdateAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        Log.e("Anna hazre"," Kam Bigare")
        var inflater:LayoutInflater = LayoutInflater.from(parent.context)
        var binding = DataBindingUtil.inflate<ListItemBinding>(inflater,R.layout.list_item,parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        var data : Country = data!![position]
        val modelData =RequiredData(data.Country,data.TotalConfirmed.toString(),
        data.TotalDeaths.toString(),data.TotalRecovered.toString())
        holder.binding.modeldata = modelData
        Log.e("Anna Hazre","eeeeeeee "+data)
    }

    override fun getItemCount(): Int {
        Log.e("viewmodel__","size:::"+data.size)
        return data.size
    }

     class Holder(val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root){

     }
}
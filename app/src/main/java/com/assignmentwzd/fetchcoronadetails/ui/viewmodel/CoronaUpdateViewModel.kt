package com.assignmentwzd.fetchcoronadetails.ui.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.assignmentwzd.fetchcoronadetails.data.model.Country
import com.assignmentwzd.fetchcoronadetails.data.repos.RemoteRepository

class CoronaUpdateViewModel : ViewModel() {
    lateinit var loading:ObservableField<Boolean>
    fun callApi() : MutableLiveData<Country>{
        return RemoteRepository().callApi()
    }
}
package com.assignmentwzd.fetchcoronadetails.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.assignmentwzd.fetchcoronadetails.data.model.Country
import com.assignmentwzd.fetchcoronadetails.data.repos.RemoteRepository

class ViewModelOfCorona constructor(private val repository:RemoteRepository): ViewModel() {
    // Expose repository and store corona update of each country
    fun callAPI():MutableLiveData<Country>{
        return repository.callApi()
    }
}
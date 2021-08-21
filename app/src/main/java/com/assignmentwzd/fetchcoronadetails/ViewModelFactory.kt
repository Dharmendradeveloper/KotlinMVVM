package com.assignmentwzd.fetchcoronadetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.assignmentwzd.fetchcoronadetails.data.repos.RemoteRepository
import com.assignmentwzd.fetchcoronadetails.ui.viewmodel.ViewModelOfCorona
import java.lang.IllegalArgumentException

class ViewModelFactory constructor(private val repo:RemoteRepository):ViewModelProvider.Factory {
    // Auto generated method or override method when extending ViewModelProvider.Factory
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(ViewModelOfCorona::class.java))
            ViewModelOfCorona(this.repo) as T
        else
            throw IllegalArgumentException("ViewModel Not Found")
    }
}
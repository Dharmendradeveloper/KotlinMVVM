package com.assignmentwzd.fetchcoronadetails.data.repos

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.assignmentwzd.fetchcoronadetails.data.model.Country
import com.assignmentwzd.fetchcoronadetails.data.retrofitapi.RetrofitAPIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RemoteRepository {
    fun callApi():MutableLiveData<Country>{
        val mutableLiveData = MutableLiveData<Country>()//MutableLiveData(Observable) object gets created
        RetrofitAPIService().fetchData().enqueue(object :Callback<Country>{
            override fun onFailure(call: Call<Country>, t: Throwable) {
                Log.e("onFailed",t.localizedMessage)
            }
            override fun onResponse(call: Call<Country>, response: Response<Country>) {
               if (response.isSuccessful)
                   mutableLiveData.postValue(response.body())
                else
                    Log.e("OnResponse ","Could not get the Data")
            }
        })
        return mutableLiveData
    }
}

private fun <T> Call<T>.enqueue(any: Any) {

}

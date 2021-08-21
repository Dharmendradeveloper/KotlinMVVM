package com.assignmentwzd.fetchcoronadetails.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.assignmentwzd.fetchcoronadetails.R
import com.assignmentwzd.fetchcoronadetails.data.model.Country
import com.assignmentwzd.fetchcoronadetails.data.model.Language
import com.assignmentwzd.fetchcoronadetails.databinding.ActivityMainBinding
import com.assignmentwzd.fetchcoronadetails.ui.adapter.CoronaVirusUpdateAdapter
import com.assignmentwzd.fetchcoronadetails.ui.viewmodel.CoronaUpdateViewModel

class MainActivity : AppCompatActivity() {
    // Create reference for adapter
//    private lateinit var rvAdapter:CoronaVirusUpdateAdapter
    private lateinit var languageList:List<Language>
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)
//        binding.rec.layoutManager = LinearLayoutManager(this)
//        binding.rec.adapter=CoronaVirusUpdateAdapter(this.Countries)
        Log.e("viewmodel__1","dddd")
        var viewMode = ViewModelProvider(this).get(CoronaUpdateViewModel::class.java)
        Log.e("viewmodel__2","dddd")
        viewMode.callApi().observe(this, Observer<Country>{
            Log.e("viewmodel__3","dddd")
            binding.rec.adapter = CoronaVirusUpdateAdapter(it.Countries)
            Log.e("viewmodel__4","dddd"+it.Countries)
        })
        binding.rec.adapter?.notifyDataSetChanged()

        // init adapter and set adapter
//        rvAdapter = CoronaVirusUpdateAdapter()
//        binding.recyclerview.adapter =rvAdapter
    }

    // add items to the list manually in our case
    private fun loadLanguage() {
        languageList = listOf(
            Language("Java" , "Exp : 3 years"),
            Language("Kotlin" , "Exp : 2 years"),
            Language("Python" , "Exp : 4 years"),
            Language("JavaScript" , "Exp : 6 years"),
            Language("PHP" , "Exp : 1 years"),
            Language("CPP" , "Exp : 8 years"),
        )
    }
}
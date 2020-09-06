package com.example.retrofitimplement.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitimplement.ApiService.HotelApi
import com.example.retrofitimplement.Model.Products
import kotlinx.coroutines.launch


class ViewModel2 : ViewModel() {
    val _response = MutableLiveData<List<Products>>()

    init {
        getProducts()
    }

    private fun getMarsRealEstateProperties() {
        viewModelScope.launch {
            try {
                val listResult = HotelApi.retrofitservice.getProducts()
//                listResult.forEach {
//                    _response.value = _response.value + it.itemName + it.gstper
//                }
//                _response.value = "Success: ${listResult.size} Mars properties retrieved"
            } catch (e: Exception) {
//                _response.value = "Failure: ${e.message}"message
            }
        }
    }

    private fun getProducts() {
        viewModelScope.launch {
            try {
                val products = HotelApi.retrofitservice.getProducts()


                val value = MutableLiveData<List<Products>>()
                value.value = products
                _response.setValue(value.value)


            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
package com.example.imdbtop100.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imdbtop100.model.MoviesResponseEntity
import com.example.imdbtop100.repository.Top100MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

@HiltViewModel
class TopMoviesViewModel @Inject constructor(
     var top100MoviesRepository: Top100MoviesRepository
) : ViewModel() {
    var liveDataResponse : MutableLiveData<List<MoviesResponseEntity>> = MutableLiveData()
    fun getTopMovies(){
        viewModelScope.launch(Dispatchers.IO) {
            var response = top100MoviesRepository.getTop100Movies()
            liveDataResponse.postValue(response)

        }
    }
}
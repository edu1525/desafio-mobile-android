package com.example.test.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.domain.usecases.GetHeroesUseCase
import com.example.test.domain.usecases.params.GetHeroesParams
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getHeroesUseCase: GetHeroesUseCase) :
    ViewModel() {
    fun getHeroes() {
        viewModelScope.launch {
            getHeroesUseCase.performAction(GetHeroesParams(offset = 0, limit = 10, orderBy = ""))
                .collect {
                    Log.e("RESPONSE", "" + it.toString())
                }
        }
    }
}
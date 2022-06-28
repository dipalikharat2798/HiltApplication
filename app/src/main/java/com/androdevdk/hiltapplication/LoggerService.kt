package com.androdevdk.hiltapplication

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun log(mdg:String){
        Log.d("TAG", "log: loggerservice")
    }
}
package com.androdevdk.hiltapplication

import android.util.Log
import javax.inject.Inject

class UserRepo @Inject constructor(val loggerService: LoggerService) {

    //constructor injection
    fun send (){
        loggerService.log("hi")
        Log.d("TAG", "send: Data")
    }


}
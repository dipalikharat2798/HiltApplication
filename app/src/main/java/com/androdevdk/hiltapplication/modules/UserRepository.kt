package com.androdevdk.hiltapplication.modules

import android.util.Log
import javax.inject.Inject

const val TAG = "UserRepo"
interface UserRepository {
    fun saveUser(email:String, password:String)
}

class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: sql")
    }

}

class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: firebase")
    }

}
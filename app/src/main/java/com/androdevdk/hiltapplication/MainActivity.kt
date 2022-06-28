package com.androdevdk.hiltapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androdevdk.hiltapplication.modules.FirebaseQualifiers
import com.androdevdk.hiltapplication.modules.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var repo: UserRepo

    @Inject
    @FirebaseQualifiers //@Named("firebase")
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        repo.send()

        userRepository.saveUser("dipali@gmail.com", "123")
    }
}
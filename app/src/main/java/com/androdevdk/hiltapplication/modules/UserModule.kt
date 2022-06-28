package com.androdevdk.hiltapplication.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named


@InstallIn(ActivityComponent:: class)
@Module
class UserModule {

//    @Provides
//   fun provideuserRepository() : UserRepository{
//       return FirebaseRepository()
//   }


    //when we have same for multiple implementation use qualifiers
    @Provides
    @Named("sql")
    fun provideSqlRepo(sqlRepository: SQLRepository):UserRepository{
        return sqlRepository
    }

    @Provides
    @FirebaseQualifiers //@Named("firebase")
    fun provideFirebaseRepo(): UserRepository{
        return FirebaseRepository()
    }

}
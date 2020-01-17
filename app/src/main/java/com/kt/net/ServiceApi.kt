package com.kt.net

import androidx.lifecycle.LiveData
import com.kt.model.BaseResult
import com.kt.model.UploadAccount
import com.kt.model.User
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ServiceApi {


    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST("login/")
    fun  getLoginResult(@Body user: User ) :LiveData<BaseResult<String>>


    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST("accountInsert/")
    fun  uploadAccount(@Body uploadAccount: UploadAccount ) :LiveData<BaseResult<Boolean>>

}
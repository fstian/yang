package com.kt.model

data class BaseResult<T>(
        val code: Int,
        val msg: String,
        val t: T)




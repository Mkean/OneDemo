package com.example.onedemo.hilt

import javax.inject.Qualifier

/**
 *@Description:
 *
 */

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindGasEngine

@Qualifier
@Retention(AnnotationRetention.BINARY) // 声明注解的作用范围，选择 AnnotationRetention.BINARY 表示该注解在编译之后会得到保留，但是无法通过反射访问
annotation class BindElectricEngine
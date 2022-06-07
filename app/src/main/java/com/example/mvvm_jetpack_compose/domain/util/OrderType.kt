package com.example.mvvm_jetpack_compose.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
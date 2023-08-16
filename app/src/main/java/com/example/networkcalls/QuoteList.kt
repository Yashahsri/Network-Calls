package com.example.networkcalls

data class QuoteList( val count: Int,
    val totalCount: Int,
    val page: Int,
    val totalPages: Int,
    val lastItemIndex: Int,
    val results: List<Results>) {
}
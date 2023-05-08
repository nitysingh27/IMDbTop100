package com.example.imdbtop100.model

data class MoviesResponseEntity(
    val description: String,
    val director: List<String>,
    val genre: List<String>,
    val id: String,
    val image: String,
    val imdbid: String,
    val rank: Int,
    val rating: String,
    val thumbnail: String,
    val title: String,
    val trailer: String,
    val writers: List<String>,
    val year: Int
)
package com.example.imdbtop100.model

data class MoviesResponseEntity(
    val description: String = " Desciption ",
    val director: List<String> = ArrayList(),
    val genre: List<String> = ArrayList(),
    val id: String = " id",
    val image: String = "Image ",
    val imdbid: String = "imdbid",
    val rank: Int = 1,
    val rating: String = "rate",
    val thumbnail: String = " thumbnail",
    val title: String = "Harry Potter",
    val trailer: String = "trailer ",
    val writers: List<String> = ArrayList(),
    val year: Int = 2023
)
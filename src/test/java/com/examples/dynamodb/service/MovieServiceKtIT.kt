package com.examples.dynamodb.service

import com.examples.dynamodb.AppConfig
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(classes = [AppConfig::class])
class MovieServiceKtIT {

    @Autowired
    private val movieServiceKt: MovieServiceKt? = null

    @Test
    fun saveMoviesKt() {
        Assert.assertTrue(movieServiceKt?.putMoviesKt("Sep movie test", 2018)!!)
    }

    @Test
    fun getAllMoviesKt() {
        val movies = movieServiceKt?.getAllMovies()
        movies?.map {
            println(it.toString())
        }
    }
}
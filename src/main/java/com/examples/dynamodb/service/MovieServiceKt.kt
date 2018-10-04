package com.examples.dynamodb.service

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedList
import com.examples.dynamodb.model.MoviesKt
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieServiceKt {

    @Autowired
    private val dynamoDBMapper: DynamoDBMapper? = null

    fun putMoviesKt(titleVal: String, yearkeyVal: Int): Boolean {
        val moviesKt = MoviesKt().apply {
            title = titleVal
            yearkey = yearkeyVal
        }
        dynamoDBMapper?.save(moviesKt)
        return true
    }

    fun getAllMovies(): PaginatedList<MoviesKt>? {
        val scanExpression = DynamoDBScanExpression()
        return dynamoDBMapper?.scan(MoviesKt::class.java, scanExpression)
    }

}
package com.examples.dynamodb.model

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBTable(tableName = "Movies")
data class MoviesKt @JvmOverloads constructor (
        @get:DynamoDBRangeKey
        var title: String = "",
        @get:DynamoDBHashKey
        var yearkey: Int = 0
)
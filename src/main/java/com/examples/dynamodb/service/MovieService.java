package com.examples.dynamodb.service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.examples.dynamodb.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    /*@Autowired
    private DynamoDBMapper dynamoDBMapper;*/


    public List<Movies> getAllMovies() {
        /*DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        return dynamoDBMapper.scan(Movies.class, scanExpression);*/
        return null;
    }
}

package com.examples.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.io.Serializable;

@DynamoDBTable(tableName = "Movies")
public class Movies implements Serializable {

    private String title;
    private Integer yearkey;

    @DynamoDBRangeKey
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @DynamoDBHashKey
    public Integer getYearkey() {
        return yearkey;
    }

    public void setYearkey(Integer yearkey) {
        this.yearkey = yearkey;
    }
}

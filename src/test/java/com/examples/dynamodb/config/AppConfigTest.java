package com.examples.dynamodb.config;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.examples.dynamodb.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@TestPropertySource("/application.properties")
public class AppConfigTest {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    @Test
    public void shouldGetDynamoDBMapper() {
        assertNotNull(dynamoDBMapper);
    }
}
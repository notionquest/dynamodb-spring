package com.examples.dynamodb.service;

import com.examples.dynamodb.AppConfig;
import com.examples.dynamodb.model.Movies;
import com.examples.dynamodb.model.MoviesKt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MovieServiceIT {

    @Autowired
    private MovieService movieService;

    @Test
    public void getAllMovies() {
        List<Movies> movies = movieService.getAllMovies();
        assertNotNull(movies);
        assertTrue(movies.size()>0);
        movies.stream().forEach(System.out::println);
    }

    @Test
    public void getAllMoviesKt() {
        List<MoviesKt> movies = movieService.getAllMoviesKt();
        assertNotNull(movies);
        assertTrue(movies.size()>0);
        movies.stream().forEach(System.out::println);
    }
}
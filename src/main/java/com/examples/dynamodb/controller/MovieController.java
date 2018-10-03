package com.examples.dynamodb.controller;

import com.examples.dynamodb.model.Movies;
import com.examples.dynamodb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movies> getMovies() {
        return movieService.getAllMovies();
    }
}

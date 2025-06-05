package com.proxy.movies;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {
    // Generate GET, POST, PUT, DELETE methods for movies
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return List.of(new Movie("The Godfather"), new Movie("The Godfather"));
    }

    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie movie) {
        System.out.println(movie);
        return movie;
    }

    @PutMapping("/movies/{name}")
    public Movie updateMovie(@PathVariable String name, @RequestBody Movie movie) {
        // In a real application, you would update the movie in a database
        return movie;
    }

    @DeleteMapping("/movies")
    public void deleteMovie(String title) {
        // In a real application, you would delete the movie from a database
        // For this example, we do nothing
    }
}

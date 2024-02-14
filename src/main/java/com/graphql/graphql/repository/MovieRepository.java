package com.graphql.graphql.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphql.graphql.Model.Movie;

import jakarta.annotation.PostConstruct;

@Repository
public class MovieRepository {

    private List<Movie> mockMovies;

    @PostConstruct
    public void initializeMockMovies() {
        mockMovies = new ArrayList<>(List.of(
                new Movie(1, "Die Hard", 1988, List.of("Action"), "John McTiernan"),
                new Movie(2, "Die Hard 2", 1990, List.of("Action"), "Renny Harlin"),
                new Movie(3, "Die Hard with a Vengeance", 1995, List.of("Action"), "John McTiernan")
        )
        );
    }

    public Movie getById(int id) {
        return mockMovies.stream().filter(movie -> Integer.valueOf(movie.id()).equals(id)).findFirst().orElse(null);
    }

    public void addMovie(Movie movie) {
        mockMovies.add(movie);
    }

    public void removeMovie(Movie movie) {
        mockMovies.remove(movie);
    }

    public void removeMovieByIndex(int index) {
        mockMovies.remove(index);
    }
}
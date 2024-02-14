package com.graphql.graphql.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphql.graphql.Model.Actor;

import jakarta.annotation.PostConstruct;

@Repository
public class ActorRepository {

    private List<Actor> mockActors;
    private MovieRepository movieRepository;

    public ActorRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostConstruct
    private void initializeMockActors() {
        mockActors = new ArrayList<>(List.of(
                new Actor(1, "Bruce Willis", "03/19/1955", List.of(movieRepository.getById(1), movieRepository.getById(2), movieRepository.getById(3))),
                new Actor(2, "Alan Rickman", "02/21/1946", List.of(movieRepository.getById(1)))
        )
        );
    }

    public Actor getById(Long id) {
        return mockActors
                .stream()
                .filter(actor -> Long.valueOf(actor.id()).equals(id))
                .findFirst()
                .orElse(null);
    }
}

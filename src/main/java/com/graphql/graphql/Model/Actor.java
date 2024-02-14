package com.graphql.graphql.Model;

import java.util.List;

public record Actor(int id, String name, String date, List<Movie> movies) {}
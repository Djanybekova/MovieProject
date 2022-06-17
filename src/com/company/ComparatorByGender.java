package com.company;

import java.util.Comparator;

public class ComparatorByGender implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (movie1.getGenre()).compareTo(movie2.getGenre());
    }
}

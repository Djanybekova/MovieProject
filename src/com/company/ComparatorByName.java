package com.company;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (movie1.getName()).compareTo(movie2.getName());
    }
}

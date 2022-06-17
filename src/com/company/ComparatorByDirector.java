package com.company;

import java.util.Comparator;

public class ComparatorByDirector implements Comparator<Movie>{

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return (movie1.getDirector().getDirectorName()).compareTo(movie2.getDirector().getDirectorName());
    }
}

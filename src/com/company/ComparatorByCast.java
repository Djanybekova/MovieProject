package com.company;

import java.util.Comparator;

public class ComparatorByCast implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        for (Cast cast: movie1.getCast()) {
            for (Cast cast1: movie2.getCast()) {
                return cast.getActor().compareTo(cast1.getActor());
            }
        }
        return 0;
    }
}

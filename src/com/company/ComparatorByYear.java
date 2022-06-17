package com.company;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getYear()- movie2.getYear();
    }
}

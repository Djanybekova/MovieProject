package com.company;

import java.util.List;

public interface SortAble {

    void sortMovieByYear(List<Movie> movies);

    void sortMovieByName(List<Movie> movies);

    void sortMovieByDirector(List<Movie> movies);

    void sortMovieByGender(List<Movie> movies);

    void sortMovieByActor(List<Movie> movies);
}

package com.company;

import java.util.*;

public class SortClass implements SortAble {

    @Override
    public void sortMovieByYear(List<Movie> movies) {
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        movies.sort(comparatorByYear);
        for (Movie movie : movies) {
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " + movie.getDirector().getDirectorLatsName());
            System.out.println(" ~~~ * Cast * ~~~");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }

            System.out.println("==============================");
        }
    }


    @Override
    public void sortMovieByName(List<Movie> movies) {
        ComparatorByName comparatorByName = new ComparatorByName();
        movies.sort(comparatorByName);
        for (Movie movie : movies) {
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " + movie.getDirector().getDirectorLatsName());
            System.out.println("~~~ * Cast * ~~~");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
            System.out.println("==========================");
        }
    }

    @Override
    public void sortMovieByDirector(List<Movie> movies) {
        ComparatorByDirector comparatorByDirector = new ComparatorByDirector();
        movies.sort(comparatorByDirector);
        for (Movie movie : movies) {
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " + movie.getDirector().getDirectorLatsName());
            System.out.println("~~~ * Cast * ~~~");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
            System.out.println("================================");
        }
    }

    @Override
    public void sortMovieByGender(List<Movie> movies) {
        ComparatorByGender comparatorByGender = new ComparatorByGender();
        movies.sort(comparatorByGender);
        for (Movie movie : movies) {
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " + movie.getDirector().getDirectorLatsName());
            System.out.println("~~~ * Cast * ~~~");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
            System.out.println("============================");
        }
    }

    @Override
    public void sortMovieByActor(List<Movie> movies) {
        ComparatorByCast comparatorByCast = new ComparatorByCast();
        movies.sort(comparatorByCast);
        for (Movie movie : movies) {
            System.out.println("Movie: " + movie.getName());
            System.out.println("Year: " + movie.getGenre());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Director: " + movie.getDirector().getDirectorName() + " " + movie.getDirector().getDirectorLatsName());
            System.out.println("~~~ * Cast * ~~~");
            for (Cast casts : movie.getCast()) {
                System.out.println("Actor: " + casts.getActor());
                System.out.println("Role: " + casts.getRole());
            }
            System.out.println("==============");
        }

    }
}

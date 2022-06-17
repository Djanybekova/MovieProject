package com.company;

import java.util.List;
import java.util.Scanner;

public class FindClass implements FindAble{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Write movies name: ");
        String moviesName = scanner.nextLine();
        for (Movie movie:movies) {
            if(moviesName.equals(movie.getName())){
                System.out.println("Movie: "+movie.getName());
                System.out.println("Year: "+movie.getYear());
                System.out.println("Genre: "+movie.getGenre());
                System.out.println("Director: "+movie.getDirector().getDirectorName()+" "+movie.getDirector().getDirectorLatsName());
                System.out.println(" ~~~ * Cast * ~~~");
                for (Cast cast:movie.getCast()) {
                    System.out.println("Actor: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                }

                System.out.println("==============================");
            }
        }
    }

    @Override
    public void findMovieByActor(List<Movie> movies) {
        System.out.println("Write moves actor: ");
        String moviesActor = scanner.nextLine();
        for(Movie movie:movies){
            for(Cast cast: movie.getCast()){
                if(moviesActor.equals(cast.getActor())){
                    System.out.println("Actor: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                    System.out.println("~~~ * Movie info*~~~");
                    System.out.println("Movie: "+movie.getName());
                    System.out.println("Year: "+movie.getYear());
                    System.out.println("Genre: "+movie.getGenre());
                    System.out.println("Director: "+movie.getDirector().getDirectorName()+" "+movie.getDirector().getDirectorLatsName());
                    System.out.println("===========================");
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write movies year:");
        int moviesYear = scanner.nextInt();
        for (Movie movie:movies){
            if(moviesYear == movie.getYear()){
                System.out.println("Year: "+movie.getYear());
                System.out.println("Movie: "+movie.getName());
                System.out.println("Genre: "+movie.getGenre());
                System.out.println("Director: "+movie.getDirector().getDirectorName()+" "+movie.getDirector().getDirectorLatsName());
                for (Cast cast: movie.getCast()) {
                    System.out.println("Actor: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                    System.out.println("=======================");
                }
            }

        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Write movies Director name: ");
        String directorName = scanner.nextLine();
        System.out.println("Write movies Director Last name: ");
        String directorLastName = scanner.nextLine();
        for (Movie movie:movies) {
                if(directorName.equals(movie.getDirector().getDirectorName()) && directorName.equals(movie.getDirector().getDirectorLatsName())){
                    System.out.println("Director: "+movie.getDirector().getDirectorName()+" "+movie.getDirector().getDirectorLatsName());
                    System.out.println("Movie: "+movie.getName());
                    System.out.println("Year:" +movie.getYear());
                    System.out.println("Genre: "+movie.getGenre());
                    System.out.println("~~~ * Cast * ~~~");
                    for (Cast cast: movie.getCast()){
                        System.out.println("Actor: "+cast.getActor());
                        System.out.println("Role: "+cast.getRole());
                }
                    System.out.println("=========================");
            }

        }

    }

    @Override
    public void findMovieByGender(List<Movie> movies) {
        System.out.println("Write movies gender: ");
        String genre = scanner.nextLine();
        for(Movie movie: movies){
            if(genre.equals(movie.getGenre())){
                System.out.println("Genre: "+movie.getGenre());
                System.out.println("Movie: "+movie.getName());
                System.out.println("Year: "+movie.getYear());
                System.out.println("Director: "+movie.getDirector().getDirectorName()+" "+movie.getDirector().getDirectorLatsName());
                System.out.println("~~~ * Cast * ~~~");
                for (Cast cast: movie.getCast()) {
                    System.out.println("Actor: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                }
                System.out.println("========================");
            }
        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Write movies Actor Role:");
        String role = scanner.nextLine();
        for (Movie movie:movies) {
            for (Cast cast: movie.getCast()){
                if(role.equals(cast.getRole())){
                    System.out.println("Role: "+cast.getRole());
                    System.out.println("Actor: "+cast.getActor());
                    System.out.println("~~~ * Movies info * ~~~ ");
                    System.out.println("Movie: "+movie.getName());
                    System.out.println("Year: "+movie.getYear());
                    System.out.println("Genre: "+movie.getGenre());
                    System.out.println("Director: "+movie.getDirector().getDirectorName()+" "+movie.getDirector().getDirectorLatsName());
                    System.out.println("======================");
                }
            }
        }

    }
}

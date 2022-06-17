package com.company;

import javax.management.MBeanRegistration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Director director1 = new Director("Крис","Коламбус");
        List<Cast> cast1 = new ArrayList<>();
        cast1.add(new Cast("Даниел Радклифф","Гарри Поттер"));
        cast1.add(new Cast("Эмма Уотсон","Гермиона Грейндж"));

        Director director2 = new Director("Эйрос","Лин");
        List<Cast> cast2 = new ArrayList<>();
        cast2.add(new Cast("Бенедикт Камбербэтч","Шерлок Холмс"));
        cast2.add(new Cast("Мартин Фримен","Джон Ватсон"));

        Director director3 = new Director("Марк","Уэбб");
        List<Cast> cast3 = new ArrayList<>();
        cast3.add(new Cast("Маккенна Грейс","Мэри Адлер"));
        cast3.add(new Cast("Крис Эванс","Фрэнк Адлер"));

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Гарри Поттер",2011,"Фантастика",director1,cast1));
        movies.add(new Movie("Шерлок Холмс",2010,"Детектив",director2,cast2));
        movies.add(new Movie("Одаренная",2017,"Комедийная драма",director3,cast3));

        while(true) {
            System.out.println("Введите 1, если вы хотите найти фильм по названию");
            System.out.println("Введите 2, если вы хотите найти фильм по году выпуска");
            System.out.println("Введите 3, если вы хотите найти фильм по Жанру");
            System.out.println("Введите 4, если вы хотите найти фильм по фамилии и имени режиссера");
            System.out.println("Введите 5, если вы хотите найти фильм по фамилии и имени актера");
            System.out.println("Введите 6, если хотите сортировать фильм в порядка возрастания по названию");
            System.out.println("Введите 7, если хотите сортировать фильм в порядка возрастания по году выпуска");
            System.out.println("Введите 8, если хотите сортировать фильм в порядка возрастания по году выпуска");
            System.out.println("Введите 9, если хотите сортировать фильм в порядка возрастания по фамилии и имени режиссеру");
            System.out.println("Введите 10, если хотите сортировать фильм в порядка возрастания по фамилии и имени актера");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            FindAble findAble = new FindClass();
            SortAble sortAble = new SortClass();

            switch (scanner.nextInt()) {
                case 1 -> findAble.findMovieByName(movies);
                case 2 -> findAble.findMovieByYear(movies);
                case 3 -> findAble.findMovieByGender(movies);
                case 4 -> findAble.findMovieByDirector(movies);
                case 5 -> findAble.findMovieByActor(movies);
                case 6 -> sortAble.sortMovieByName(movies);
                case 7 -> sortAble.sortMovieByYear(movies);
                case 8 -> sortAble.sortMovieByGender(movies);
                case 9 -> sortAble.sortMovieByDirector(movies);
                case 10 -> sortAble.sortMovieByActor(movies);
                default -> System.out.println("Вы ввели неправильное число");
            }
        }

    }

}

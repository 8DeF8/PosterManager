package ru.netology.javaqa;
import ru.netology.javaqa.PosterManager;
import ru.netology.javaqa.domain.Poster;

public class Main {

    public static void main(String[] args) {

        PosterManager film1 = new PosterManager("Фильм 1");
        PosterManager film2 = new PosterManager("Фильм 2");
        PosterManager film3 = new PosterManager("Фильм 3");
        PosterManager film4 = new PosterManager("Фильм 4");
        PosterManager film5 = new PosterManager("Фильм 5");
        PosterManager film6 = new PosterManager("Фильм 6");
        PosterManager film7 = new PosterManager("Фильм 7");

        PosterManager manager = new PosterManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        PosterManager[] all = manager.findLast();

    }

}
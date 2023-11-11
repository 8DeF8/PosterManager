package ru.netology.javaqa;

import ru.netology.javaqa.domain.Poster;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import ru.netology.javaqa.Main;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    PosterManager film1 = new PosterManager("Фильм 1");
    PosterManager film2 = new PosterManager("Фильм 2");
    PosterManager film3 = new PosterManager("Фильм 3");
    PosterManager film4 = new PosterManager("Фильм 4");
    PosterManager film5 = new PosterManager("Фильм 5");
    PosterManager film6 = new PosterManager("Фильм 6");
    PosterManager film7 = new PosterManager("Фильм 7");

    @Test
    public void test1FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);



        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);


        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4FindLast() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);



        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test5FindLast() {
        PosterManager manager = new PosterManager();


        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);


        PosterManager[] actual = manager.findAll();
        PosterManager[] expected = {film1, film2, film3, film4, film5, film6, film7};

        assertArrayEquals(actual, expected);
    }

}
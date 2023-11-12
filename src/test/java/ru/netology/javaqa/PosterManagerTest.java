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

    public void testFindAll() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        PosterManager[] actual = manager.findAll();
        PosterManager[] expected = {film1, film2, film3};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindLastWhenLimitEqualsSize() {
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
    public void testFindLastWhenLimitMoreSize() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindLastWhenLimitLessSize() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film7, film6, film5, film4, film3};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindLastWhenLimitEqualsSizeWithCustomLimit() {
        PosterManager manager = new PosterManager(3);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);


        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindLastWhenLimitMoreSizeWithCustomLimit() {
        PosterManager manager = new PosterManager(7);
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
    public void testFindLastWhenLimitLessSizeWithCustomLimit() {
        PosterManager manager = new PosterManager(3);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        PosterManager[] actual = manager.findLast();
        PosterManager[] expected = {film7, film6, film5};

        assertArrayEquals(actual, expected);

    }

}
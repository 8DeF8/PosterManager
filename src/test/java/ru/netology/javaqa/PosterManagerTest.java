package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitEqualsSize() {
        PosterManager manager = new PosterManager();
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitMoreSize() {
        PosterManager manager = new PosterManager();
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitLessSize() {
        PosterManager manager = new PosterManager();
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitEqualsSizeCustom() {
        PosterManager manager = new PosterManager(3);
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitMoreSizeCustom() {
        PosterManager manager = new PosterManager(7);
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitLessSizeCustom() {
        PosterManager manager = new PosterManager(3);
        String movie1 = "Фильм 1";
        String movie2 = "Фильм 2";
        String movie3 = "Фильм 3";
        String movie4 = "Фильм 4";
        String movie5 = "Фильм 5";
        String movie6 = "Фильм 6";
        String movie7 = "Фильм 7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }





}
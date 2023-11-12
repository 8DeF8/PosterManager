package ru.netology.javaqa;
import ru.netology.javaqa.domain.Poster;


public class PosterManager {
    private PosterManager[] playbill = new PosterManager[0];
    private int limit;

    public PosterManager() {
        limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager(String s) {
    }


    public void add(PosterManager item) {
        int length = playbill.length + 1;
        PosterManager[] tmp = new PosterManager[length];
        System.arraycopy(playbill, 0, tmp, 0, playbill.length);


        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        playbill = tmp;

    }

    public PosterManager[] findLast() {
        PosterManager[] playbill = findAll();
        PosterManager[] result;
        if (limit < playbill.length) {
            result = new PosterManager[limit];
        } else {
            result = new PosterManager[playbill.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = playbill.length - i - 1;
            result[i] = playbill[index];
        }
        return result;
    }

    public PosterManager[] findAll() {
        return playbill;
    }

}
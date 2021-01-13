package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Repository {
    private final ArrayList <Film> storageFilms = new ArrayList<>();
    private final ArrayList <Actor> storageActors = new ArrayList<>();
    public Repository() {

    }

    public ArrayList<Film> getAllFilms() {
        return storageFilms;
    }
    public void addActor(Actor a) {
        storageActors.add(a);
    }

    public void addFilm(Film f) {
        storageFilms.add(f);
    }

    public void deleteActor(Actor a) { storageActors.remove(a);}

    public void deleteFilm(Film f) {storageFilms.remove(f); }

    public Actor getTopActor() {
        int maxCount = -1;
        Actor maxActor = null;
        for (var a : storageActors) {
            int count = 0;
            for (var f : storageFilms) {
                if (f.getActori().contains(a))
                    count += 1;
            }
            if (count > maxCount) {
                maxActor = a;
                maxCount = count;
            }
        }
        return maxActor;
    }
}

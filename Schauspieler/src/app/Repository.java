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

    public void addActor(Actor a) {
        storageActors.add(a);
    }

    public void addFilm(Film f) {
        storageFilms.add(f);
    }

    public void deleteActor(Actor a) { storageActors.remove(a);}

    public void deleteFilm(Film f) {storageFilms.remove(f); }

}

package app;

import java.util.ArrayList;

public class Film {
    public String title;
    public TipFilm tip;
    public ArrayList<Actor> actori = new ArrayList<>();


    public Film(String title, TipFilm tip, ArrayList<Actor> actori) {
        this.title = title;
        this.tip = tip;
        this.actori = actori;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TipFilm getTip() {
        return tip;
    }

    public void setTip(TipFilm tip) {
        this.tip = tip;
    }

    public ArrayList<Actor> getActori() {
        return actori;
    }

    public void setActori(ArrayList<Actor> actori) {
        this.actori = actori;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", tip=" + tip +
                ", actori=" + actori +
                '}';
    }
}

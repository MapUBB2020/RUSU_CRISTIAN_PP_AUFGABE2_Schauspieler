package app;

public class Actor {
    public String nume;
    public int noOscars;

    public Actor(String nume, int noOscars) {
        this.nume = nume;
        this.noOscars = noOscars;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNoOscars() {
        return noOscars;
    }

    public void setNoOscars(int noOscars) {
        this.noOscars = noOscars;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Nume='" + nume + '\'' +
                ", noOscars=" + noOscars +
                '}';
    }
}

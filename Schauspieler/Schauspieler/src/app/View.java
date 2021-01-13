package app;


import java.util.ArrayList;
import java.util.Scanner;

public class View {
    Repository r = new Repository();
    public void printMenu() {
        System.out.println("1. Add an actor.\n" +
                "2. Add a movie. \n" +
                "3. Show all movies. \n" +
                "4. Change an actor. \n" +
                "5. Change a movie. \n" +
                "6. Get top actor. \n" +
                "7. Delete a movie. \n" +
                "8. Delete an actor. \n" +
        "0. exit");
    }

    public void addActor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("Number of oscars: ");
        int nrOscars = in.nextInt();
        r.addActor(new Actor(name, nrOscars));
    }

    public void addFilm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Titlu: ");
        String name = in.nextLine();
        System.out.println("Tip Film: ");
        TipFilm t = TipFilm.valueOf(in.nextLine());
        System.out.println("Numar de actori: ");
        int n = in.nextInt();
        ArrayList<Actor> actors = new ArrayList<>();
        for (int i = 1; i<=n;i++) {
            System.out.println("Nume actor: ");
            Actor a = r.findActor(in.nextLine());
            actors.add(a);
        }
        r.addFilm(new Film(name,t, actors));
    }

    public void showAllMovies() {
        for (var m : r.getAllFilms()) {
            System.out.println(m + "\n");
        }
    }

    public void getTopActor() {
        System.out.println("Top actor: " + r.getTopActor());
    }

    public void deleteActor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nume: ");
        String name = in.nextLine();
        r.deleteActor(r.findActor(name));
    }
    public void deleteFilm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Titlu: ");
        String name = in.nextLine();
        r.deleteFilm(r.findFilm(name));
    }
    public void start() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                printMenu();
                System.out.print("Enter a number: ");
                String option = in.nextLine();
                if (option.equals("0"))
                    break;
                else if (option.equals("1"))
                    addActor();
                else if (option.equals("2"))
                    addFilm();
                else if (option.equals("3"))
                    showAllMovies();
                else if (option.equals("6"))
                    getTopActor();
                else if (option.equals("7"))
                    deleteFilm();
                else if (option.equals("8"))
                    deleteActor();
            } catch (Exception e) {
                System.out.println("Wrong input!\n");
            }

        }
        in.close();
    }
}

package app;


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

    public void start() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                printMenu();
                System.out.print("Enter a number: ");
                String option = in.nextLine();
                if (option.equals("0"))
                    break;
            } catch (Exception e) {
                System.out.println("Wrong input!\n");
            }

        }
        in.close();
    }
}

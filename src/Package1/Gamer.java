package Package1;

import java.util.Scanner;

public class Gamer extends Player {

    Scanner scanner = new Scanner(System.in);


    public Gamer(String name) {

        super(name);
    }


    public void setChoice()
    {
        int choice = scanner.nextInt();
        super.setChoice(choice);
    }

    @Override
    public int getChoice() {
        return super.getChoice();
    }
}

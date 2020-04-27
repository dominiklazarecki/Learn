package Package1;

import java.util.Scanner;

public class Gamer extends Player {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void takeChoice() {
        System.out.println("Wprowadź swój wybor: ");
       int choice =  scanner.nextInt();
       setChoice(choice);
    }



    @Override
    public int getChoice()
    {
        return super.getChoice();
    }
}

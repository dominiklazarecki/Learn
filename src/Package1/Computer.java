package Package1;

import java.util.Random;

public class Computer extends Player {
    private Random random = new Random();
    public Computer() {
        super("Computer");

    }

    public void setChoice() {

        int choice = (random.nextInt(3) + 1);
        super.setChoice(choice);
    }

    @Override
    public int getChoice() {
        return super.getChoice();
    }
}

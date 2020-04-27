package Package1;

import java.util.Random;

public class Computer extends Player {
    private Random random = new Random();

    public Computer() {
        super("Computer");

    }
    @Override
    public void takeChoice()
    {
        setChoice(random.nextInt(3));
    }

    @Override
    public int getChoice() {
        return super.getChoice();
    }
}

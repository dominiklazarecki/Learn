package Package1;


public class Computer extends Player {


    public Computer() {
        super("Computer");

    }
    @Override
    public void takeChoice(int choice)
    {
        setChoice(choice);
    }

    @Override
    public int getChoice()
    {
        return super.getChoice();
    }
}

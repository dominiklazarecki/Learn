package Package1;

public enum Figure {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int choice;

    Figure(int choice)
    {
        this.choice = choice;
    }

    public int getChoice()
    {
        return choice;
    }


}

package Package1;

public enum Figure {
    ROCK(1, "kamien"),
    PAPER(2, "papier"),
    SCISSORS(3,"nozyczki");

    private int choice;
    private String figureName;

    Figure(int choice, String figureName)

    {
        this.choice = choice;
        this.figureName = figureName;
    }


    public int getChoice()
    {
        return choice;
    }

    public String getFigureName() { return figureName;}


}

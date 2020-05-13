package Package1;

public abstract class Player {

   private String name;
   private int choice;

    Player()
    {

    }
    Player(String name)
    {
        this.name = name;
    }

    public abstract  void takeChoice(int choice);

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public int getChoice()
    {
        return choice;
    }

    public void setChoice(int choice)
    {
        this.choice = choice;
    }



}

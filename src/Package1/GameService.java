package Package1;

public class GameService {

    private Gamer gamer;
    private Computer computer;
    private Game game;
    private ChoiceManager gamerChoice;
    private ChoiceManager computerChoice;
    private int round = 1;

    public GameService(Gamer gamer, Computer computer, Game game, ChoiceManager gamerChoice, ChoiceManager computerChoice) {
        this.gamer = gamer;
        this.computer = computer;
        this.game = game;
        this.gamerChoice = gamerChoice;
        this.computerChoice = computerChoice;
    }







    public void switchFigure() {
            switch (gamerChoice.chosenFigure()) {
                case ROCK:
                    System.out.println("Użytkownik wybrał Kamień");
                    game.resultForRock(gamerChoice.giveChoiceFigureName(), computerChoice.giveChoiceFigureName());
                    break;
                case PAPER:
                    System.out.println("Użytkownik wybrał Papier");
                    game.resultForPaper(gamerChoice.giveChoiceFigureName(), computerChoice.giveChoiceFigureName());
                    break;
                case SCISSORS:
                    System.out.println("Użytkownik wybrał Nożyczki");
                    game.resultForScissors(gamerChoice.giveChoiceFigureName(), computerChoice.giveChoiceFigureName());
                    break;
            }
    }



   void roundCounter()
    {
        round++;
    }

    public boolean endGame() {
        return round > 3;
    }

    public int getRound()
    {
        return round;
    }
}

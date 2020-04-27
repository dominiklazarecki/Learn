package Package1;

public class GameService {

    private Gamer gamer;
    private Computer computer;

    public GameService(Gamer gamer, Computer computer) {
        this.gamer = gamer;
        this.computer = computer;
    }

    public String gamerChoice() {
        String choice = Figure.values()[gamer.getChoice()].getFigureName();
        return choice;
    }

    public String computerChoice() {
        String choice = Figure.values()[computer.getChoice()].getFigureName();
        return choice;
    }


}

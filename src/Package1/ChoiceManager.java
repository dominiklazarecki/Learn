package Package1;

public class ChoiceManager {

    private Player player;

    ChoiceManager(Player player) {
        this.player = player;
    }

    public Figure chosenFigure() {
        Figure choice = Figure.values()[player.getChoice() - 1];
        return choice;
    }

    public String giveChoiceFigureName() {
        String figureName = chosenFigure().getFigureName();
        return figureName;
    }
}

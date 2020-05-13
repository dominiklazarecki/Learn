package Package1;

public class ProgramDemo {


    void demostrateProgram() {
        Game game = new Game();
        Gamer gamer = new Gamer();
        Computer computer = new Computer();
        ChoiceManager gamerChoice = new ChoiceManager(gamer);
        ChoiceManager computerChoice = new ChoiceManager(computer);
        GameService gameService = new GameService(gamer, computer, game, gamerChoice, computerChoice);
        GameController gameController = new GameController(gameService, gamer, computer);
        gameController.start();
    }

}

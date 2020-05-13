package Package1;

import java.util.*;

public class GameController {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private GameService gameService;
    private Gamer gamer;
    private Computer computer;


    GameController(GameService gameService, Gamer gamer, Computer computer) {
        this.gameService = gameService;
        this.gamer = gamer;
        this.computer = computer;
    }

    void start()
    {
        header();
        gamerNameEntering();
        gamerWelcoming();
        proceedingOfGame();
    }

    public void header() {
        System.out.println("------------------Witaj w grze Kamień Papier Nyżyczki------------------\n" +
                "Wprowadź swoje imię: ");

    }

    private void gamerNameEntering() {
        String name = scanner.nextLine();
        gamer.setName(name);
    }

    private void gamerWelcoming() {
        System.out.println("Witaj w grze, " + gamer.getName() + "!");
    }

    void proceedingOfGame() {
        do {
            roundDisplayer();
            gamePlay();
            gameService.roundCounter();
        } while (!gameService.endGame());
    }

    private void roundDisplayer() {
        System.out.println("Runda nr: " + gameService.getRound());
    }

    private void gamePlay() {
        System.out.println("Wprowadź swój wybór: ");
        Map<String, String> map =   menuOptions();
        playersChoices();
        whatChoiceComputerInfo();
        gameService.switchFigure();
    }
// programowanie funkcyjne java



    private Map<String, String> menuOptions() {
        Map<String, String> optionsMap = new HashMap<>();
        optionsMap.put("1.","Kamień");
        optionsMap.put("2", "Papier");
        optionsMap.put("3", "Nożyczki");
        return optionsMap;
    }
//  stworzenie metody do wyświtelania menu
//  w jaki sposób wyświetlić elementy mapy za pomocą foreach
    private void playersChoices() {
        gamer.takeChoice(scanner.nextInt());
        computer.takeChoice(random.nextInt(3) + 1);
    }


    public void whatChoiceComputerInfo() {
        if (computer.getChoice() == 1)
            System.out.println("Komputer wybrał Kamień");
        else if (computer.getChoice() == 2) {
            System.out.println("Komputer wybrał Papier");
        } else if (computer.getChoice() == 3) {
            System.out.println("Komputer wybrał Nożyczki");
        }
    }


}

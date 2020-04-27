package Package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        Computer computer = new Computer();
//        Gamer gamer = new Gamer("Dominik");
//        gamer.setChoice();
//        System.out.println(gamer.getChoice());
//       // computer.setChoice();
////        computer.setChoice(1);
//
//       // System.out.println(computer.getChoice());



//        System.out.println("Wybor gracza nr 1: ");
//        String player1Input = scanner.nextLine();
//        System.out.println("Wybor gracza nr 2: ");
//        String player2Input = scanner.nextLine();


        Gamer gamer = new Gamer();
        gamer.takeChoice();
        Computer computer = new Computer();
        computer.takeChoice();
        GameService gameService = new GameService(gamer, computer);

        Game game = new Game();
        game.remis(gameService.gamerChoice(), gameService.computerChoice());
        game.winPlayer1(gameService.gamerChoice(), gameService.computerChoice());
        game.winPlayer2(gameService.gamerChoice(), gameService.computerChoice());


    }
}

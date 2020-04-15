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

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Wybor gracza nr 1: ");
        String player1Input = scanner.nextLine();
        System.out.println("Wybor gracza nr 2: ");
        String player2Input = scanner.nextLine();

        game.remis(player1Input , player2Input);
        game.winPlayer1(player1Input , player2Input);
        game.winPlayer2(player1Input , player2Input);








        


    }
}

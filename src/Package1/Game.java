package Package1;

import java.util.Scanner;

public class Game {

    public Player kamienPapierNozyce(Gamer gamer, Computer computer)
    {


        return null;
    }












        public void remis(String player1Input, String player2Input)
        {
            if(player1Input.equalsIgnoreCase("kamien") && player2Input.equalsIgnoreCase("kamien"))
            {
                System.out.println("Remis");
            }
            else if( player1Input.equalsIgnoreCase("nozyczki") && player2Input.equalsIgnoreCase("nozyczki"))
            {
                System.out.println("Remis");
            }
            else if(player1Input.equalsIgnoreCase("papier") && player2Input.equalsIgnoreCase("papier"))
            {
                System.out.println("Remis");
            }
        }

        public void winPlayer1(String player1Input, String player2Input)
        {
            if(player1Input.equalsIgnoreCase("kamien") && player2Input.equalsIgnoreCase("nozyczki"))
            {
                System.out.println("Wygrywa gracz numer 1");
            }
            if(player1Input.equalsIgnoreCase("nozyczki") && player2Input.equalsIgnoreCase("papier"))
            {
                System.out.println("Wygrywa gracz numer 1");
            }
            if(player1Input.equalsIgnoreCase("papier") && player2Input.equalsIgnoreCase("kamien"))
            {
                System.out.println("Wygrywa gracz numer 1");
            }
        }

        public void winPlayer2(String player1Input, String player2Input)
        {
            if(player1Input.equalsIgnoreCase("kamien") && player2Input.equalsIgnoreCase("papier"))
            {
                System.out.println("Wygrywa gracz numer 2");
            }
            if(player1Input.equalsIgnoreCase("nozyczki") && player2Input.equalsIgnoreCase("kamien"))
            {
                System.out.println("Wygrywa gracz numer 2");
            }
            if(player1Input.equalsIgnoreCase("papier") && player2Input.equalsIgnoreCase("nozyczki"))
            {
                System.out.println("Wygrywa gracz numer 2");
            }
        }

}

package Package1;


public class Game {

        public void resultForRock(String player1Input, String player2Input)
        {
            if(player1Input.equalsIgnoreCase(Figure.ROCK.getFigureName()) && player2Input.equalsIgnoreCase(Figure.ROCK.getFigureName()))
            {
                System.out.println("Remis");
            }
            else if( player1Input.equalsIgnoreCase(Figure.ROCK.getFigureName()) && player2Input.equalsIgnoreCase(Figure.SCISSORS.getFigureName()))
            {
                System.out.println("Wygrywa Kamien");
            }
            else if(player1Input.equalsIgnoreCase(Figure.ROCK.getFigureName()) && player2Input.equalsIgnoreCase(Figure.PAPER.getFigureName()))
            {
                System.out.println("Przegrywa Papier");
            }
        }

        public void resultForPaper(String player1Input, String player2Input)
        {
            if(player1Input.equalsIgnoreCase(Figure.PAPER.getFigureName()) && player2Input.equalsIgnoreCase(Figure.PAPER.getFigureName()))
            {
                System.out.println("Remis");
            }
            if(player1Input.equalsIgnoreCase(Figure.PAPER.getFigureName()) && player2Input.equalsIgnoreCase(Figure.SCISSORS.getFigureName()))
            {
                System.out.println("Wygrywają Nożyczki");
            }
            if(player1Input.equalsIgnoreCase(Figure.PAPER.getFigureName()) && player2Input.equalsIgnoreCase(Figure.ROCK.getFigureName()))
            {
                System.out.println("Wygrywa Papier");
            }
        }

        public void resultForScissors(String player1Input, String player2Input)
        {
            if(player1Input.equalsIgnoreCase(Figure.SCISSORS.getFigureName()) && player2Input.equalsIgnoreCase(Figure.SCISSORS.getFigureName()))
            {
                System.out.println("Remis");
            }
            if(player1Input.equalsIgnoreCase(Figure.SCISSORS.getFigureName()) && player2Input.equalsIgnoreCase(Figure.PAPER.getFigureName()))
            {
                System.out.println("Wygrywa Nożyczki");
            }
            if(player1Input.equalsIgnoreCase(Figure.SCISSORS.getFigureName()) && player2Input.equalsIgnoreCase(Figure.ROCK.getFigureName()))
            {
                System.out.println("Wygrywa Kamien");
            }
        }

}

package Activity;

public class GuessingGame {
  Boolean isGameOver = false;
  int numberGuess;
  Player p1 = new Player();
  Player p2 = new Player();
  Player p3 = new Player();

  void gameStart() {
    Boolean p1Guessed;
    Boolean p2Guessed;
    Boolean p3Guessed;

    numberGuess = (int) (Math.random() * 9);

    while (!isGameOver) {
      p1.guessed();
      p2.guessed();
      p3.guessed();
      p1Guessed = p1.numGuess == numberGuess;
      p2Guessed = p2.numGuess == numberGuess;
      p3Guessed = p3.numGuess == numberGuess;

      System.out.println("Number to guess is " + numberGuess);
      System.out.println("Player one guessed " + p1.numGuess);
      System.out.println("Player two guessed " + p2.numGuess);
      System.out.println("Player three guessed " + p3.numGuess);
      if (p1Guessed || p2Guessed || p3Guessed) {
        isGameOver = true;
        System.out.println("We have a Winner!");
        System.out.println("Player one got it right? " + p1Guessed);
        System.out.println("Player two got it right? " + p2Guessed);
        System.out.println("Player three got it right? " + p3Guessed);
        System.out.println("Game is over.");
      } else {
        System.out.println("Players will have to try again.");
      }
    }
  }
}

class Player {
  int numGuess;

  void guessed() {
    numGuess = (int) (Math.random() * 9);
  }
}

class GameLauncher {
  public static void main(String[] args) {
    GuessingGame launcher = new GuessingGame();
    launcher.gameStart();
  }
}
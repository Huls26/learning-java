package Project;

import java.util.ArrayList;

public class DotComBust {
  GameHelper helper = new GameHelper();
  ArrayList<String> doComList = new ArrayList<String>();
  int numOfGuesses = 0;

  void setUpGame() {
    DotCom dotCom = new DotCom();

  }

  void startPlaying() {

  }

  void checkUserGuess() {

  }

  void finishGame() {

  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    String p = game.helper.getUserInput("Enter a guess: ");

    System.out.println(p);
  }
}

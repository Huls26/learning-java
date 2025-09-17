package Project;

import java.util.ArrayList;

public class DotComBust {
  GameHelper helper = new GameHelper();
  ArrayList<String> doComList = new ArrayList<String>();
  int numOfGuesses = 0;

  void setUpGame() {
    DotCom dotCom1 = new DotCom();
    DotCom dotCom2 = new DotCom();
    DotCom dotCom3 = new DotCom();

    dotCom1.setName("Pet.com");
    dotCom2.setName("Store.com");
    dotCom3.setName("Boat.com");

  }

  void startPlaying() {

  }

  void checkUserGuess() {

  }

  void finishGame() {

  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    ArrayList<String> o = game.helper.placeDotCom(2);
    System.out.println(o);
    game.setUpGame();
  }
}

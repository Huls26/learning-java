package Project;

import java.util.ArrayList;

public class DotComBust {
  GameHelper helper = new GameHelper();
  ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
  int numOfGuesses = 0;

  void setUpGame() {
    String[] dotComName = { "Pet.com", "Store.com", "Boat.com" };

    for (String name : dotComName) {
      DotCom newDotCom = new DotCom();
      newDotCom.setName(name);
      dotComList.add(newDotCom);
    }

    dotComList.forEach(dot -> System.out.println(dot.getName()));
  }

  void startPlaying() {

  }

  void checkUserGuess() {

  }

  void finishGame() {

  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
  }
}

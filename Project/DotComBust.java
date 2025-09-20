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

      ArrayList<String> randomLocation = helper.placeDotCom(3);
      newDotCom.setLocationCells(randomLocation);

      ArrayList<String> locationCells = newDotCom.getLocationCells();
      System.out.println(locationCells);
    }
  }

  void startPlaying() {

  }

  void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";

    for (DotCom dotCom : dotComList) {
      String dotComCheck = dotCom.checkYourSelf(userGuess);
      if (dotComCheck.equals("hit")) {
        // int idxCell = dotCom.getLocationCells().indexOf(userGuess);
        dotCom.getLocationCells().remove(userGuess);
        result = "hit";
        break;
      } else if (dotComCheck.equals("kill")) {
        dotComList.remove(dotCom);
        result = "kill";
        break;
      }
    }

    System.out.println(result);
  }

  void finishGame() {

  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.checkUserGuess("a1");
    game.checkUserGuess("b3");
    game.checkUserGuess("c2");
  }
}

package Project;

public class SimpleDotCom {
  private int[] locationCells;
  private int numOfHits = 0;

  String checkYourSelf(String userGuess) {
    int userGuessInt = Integer.parseInt(userGuess);
    int hitsEnd = 3;

    for (int cell : locationCells) {
      if (cell == userGuessInt) {
        numOfHits++;

        return numOfHits == hitsEnd ? "kill" : "hit";
      }
    }

    return "miss";
  }

  void setLocationCells(int[] locations) {

  }
}

class SimpleDotComTestDrive {
  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();

    int[] locations = { 2, 3, 4 };
    dot.setLocationCells(locations);

    String userGuess = "2";

    if (dot.checkYourSelf(userGuess).equals("hit")) {
      System.out.println("Passed");
    } else {
      System.out.println("Failed");
    }

    if (dot.checkYourSelf("1").equals("miss")) {
      System.out.println("Passed");
    } else {
      System.out.println("Failed");
    }
  }
}
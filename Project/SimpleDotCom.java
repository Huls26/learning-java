package Project;

public class SimpleDotCom {
  private int[] locationCells;
  private int numOfHits = 0;

  String checkYourSelf(String userGuess) {

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
    String testResult = "Failed";
    String result = dot.checkYourSelf(userGuess);

    if (dot.checkYourSelf(userGuess).equals("hit")) {
      testResult = "Passed";
    }

    if (dot.checkYourSelf("1").equals("miss")) {
      testResult = "Passed";
    }

    System.out.println(testResult);
  }
}
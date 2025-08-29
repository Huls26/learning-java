package Project;

public class SimpleDotCom {
  private int[] locationCells;
  private int numOfHits = 0;

  int getNumOfHits() {
    return numOfHits;
  }

  String checkYourSelf(String userGuess) {
    int integerGuess = Integer.parseInt(userGuess);
    int x = 0;

    while (x < 3) {
      int currentValue = locationCells[x];

      if (currentValue == integerGuess) {
        numOfHits = numOfHits + 1;

        if (numOfHits == 3) {
          return "kill";
        } else {
          return "hit";
        }
      }
    }

    return "miss";
  }

  // Pick randomNum between 0 and 4
  // For each index in locationCells (size 3):
  // store randomNum + index
  // Result: locationCells contains 3 consecutive numbers
  void setLocationCells() {
    locationCells = new int[3];
    int randomNum = (int) (Math.random() * 5);
    int x = 0;

    while (x < 3) {
      locationCells[x] = randomNum + x;
      x = x + 1;
    }
  }
}

class SimpleDotComTestDrive {
  public static void main(String[] args) {
    SimpleDotCom testRun = new SimpleDotCom();
    int numberOfGuess = 0;

    testRun.setLocationCells();

    while (testRun.getNumOfHits() < 3) {
      String userGuess = System.console().readLine("Enter a number ");
      System.out.println(testRun.checkYourSelf(userGuess));
      if (testRun.checkYourSelf(userGuess) == "kill") {
        System.out.println("You took " + numberOfGuess + " guess");
      }
    }
  }
}
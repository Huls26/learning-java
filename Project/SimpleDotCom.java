package Project;

import java.util.Arrays;

public class SimpleDotCom {
  private int[] locationCells;
  private int numOfHits = 0;

  int[] getLocationCells() {
    return locationCells;
  }

  String checkYourSelf(String userGuess) {
    int integerGuess = Integer.parseInt(userGuess);

    return "hit";
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
    SimpleDotCom test = new SimpleDotCom();

    test.setLocationCells();
    System.out.print(Arrays.toString(test.getLocationCells()));
  }
}
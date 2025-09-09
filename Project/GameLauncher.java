package Project;

// declare number of guess;
// create a 3 consecutive numbeer from 0 - 4
// put it to location cell
// while number of hits < 3 || gameIsNotOveer
// ask user to guess a number
// increment number of guess;
// if the user guess contain in location cell
// if the numbeer of hits is equal to the location cell
// return kill
// else reeturn hit /// gameIsNotOver = false;
// else return miss
// display the number of guesses
public class GameLauncher {
  public static void main(String[] args) {
    int numberOfGuess = 0;
    int[] consecutiveNum = new int[3];
    int randomNum = (int) (Math.random() * 5);

    for (int x = 0; x < 3; x++) {
      consecutiveNum[x] = randomNum + x;
    }
  }
}

package Project;

import java.util.ArrayList;

public class DotCom {
  private ArrayList<String> locationCells;

  // private numOfHits = 0;

  public void setLocationCells(ArrayList<String> locations) {
    locationCells = locations;
  }

  public String checkYourSelf(String userGuess) {
    int idx = locationCells.indexOf(userGuess);

    if (locationCells.contains(userGuess)) {
      locationCells.remove(idx);

      return locationCells.isEmpty() ? "kill" : "hit";
    }

    return "miss";
  }
}

class DotComTestDrive {
  public static void main(String[] args) {
    DotCom d = new DotCom();
    ArrayList<String> locationList = new ArrayList<String>();

    locationList.add("1");
    locationList.add("2");
    locationList.add("3");

    d.setLocationCells(locationList);
    String d1 = d.checkYourSelf("1");
    String d2 = d.checkYourSelf("2");
    String d3 = d.checkYourSelf("4");
    String d4 = d.checkYourSelf("1");
    String d5 = d.checkYourSelf("3");

    if (d1.equals("hit")) {
      System.out.println("passed");
    } else {
      System.out.println("failed");
    }

    if (d2.equals("hit")) {
      System.out.println("passed");
    } else {
      System.out.println("failed");
    }

    if (d3.equals("miss")) {
      System.out.println("passed");
    } else {
      System.out.println("failed");
    }

    if (d4.equals("miss")) {
      System.out.println("passed");
    } else {
      System.out.println("failed");
    }

    if (d5.equals("kill")) {
      System.out.println("passed");
    } else {
      System.out.println("failed");
    }
  }
}
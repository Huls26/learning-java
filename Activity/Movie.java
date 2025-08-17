package Activity;

public class Movie {
  String title;
  String genre;
  int rating;

  void playIt() {
    System.out.println("Playing the movie");
  }

  void displayMovie() {
    System.out.println(title);
    System.out.println(genre);
    System.out.println(rating);
  }
}

class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "The Sand";
    one.genre = "Horror";
    one.rating = 4;
    one.playIt();
    one.displayMovie();
  }
}

// Build a guessing game like the example in the book.
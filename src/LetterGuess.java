import java.util.Scanner;
import java.util.Random;;

public class LetterGuess {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String userChoice = "";
    int guessesLeft = 3;
    String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
        "T", "U",
        "V", "W", "X", "Y", "Z" };
    int index = rand.nextInt(letters.length);

    System.out.println("Welcome to the letter guess game!");
    System.out.println("You have " + guessesLeft + " chances to win.");
    System.out.println("Please choose one letter from the alphabet:");
    userChoice = sc.nextLine().toUpperCase();

    if (userChoice.equals(letters[index])) {
      System.out.println("Congratualations! You have won!");
    } else if (!userChoice.equals(letters[index])) {
      System.out.println("Sorry, that is not the correct letter.");
      guessesLeft -= 1;
      System.out.println("You have " + guessesLeft + " remaining. Please choose again:");
    } else if (guessesLeft == 0) {
      System.out.println("Sorry, the correct letter was " + letters[index] + ". You lose!");
    }

  }
}

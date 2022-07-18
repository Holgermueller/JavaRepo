import java.util.Scanner;
import java.util.Random;;

public class LetterGuess {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String userChoice = "";
    int guessesLeft = 3;
    int guessesTaken = 0;
    String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
        "T", "U",
        "V", "W", "X", "Y", "Z" };
    int index = rand.nextInt(letters.length);

    System.out.println(letters[index]);
  }
}

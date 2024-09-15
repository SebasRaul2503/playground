import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String formed_word = "";

        long steps = 0;

        System.out.print("Type the word to match: ");//user input
        String word = scanner.next();

        while (!formed_word.contains(word)){
            char random_letter = letters.charAt(random.nextInt(letters.length()));
            formed_word+=random_letter;
            steps++;

            if (formed_word.length() > 100) {// can change this limit to compare larger strings
                formed_word = formed_word.substring(50); // keers the last 50 letters after reach the limit of 100
            }
        }

        System.out.println("The word " +  word + " was found after " + steps + " characters generated, here the last 50 letters:\n" + formed_word); 
    }
}

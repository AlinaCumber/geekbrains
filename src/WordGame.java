import com.sun.xml.internal.txw2.output.DumpSerializer;

import java.util.Random;
import java.util.Scanner;

public class WordGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static int lookingForWord = random.nextInt(words.length);
    private static String computerWord = words[lookingForWord];
    private static String userAnswer;


    public static void main (String[] args) {
        GuessWord();


    }

    public static String ShowingLetter (String showLetter, int... args) {

        for (int i = 0; i < args.length; i++) {
            if (args[i] < showLetter.length() && args[i] >= 0) {
                System.out.print(showLetter.charAt(args[i]));
                System.out.println();
            }
        }
        return showLetter;
    }

    public static void GuessWord () {


        ShowingLetter(computerWord, 0);
        System.out.println("Компьютер загадал слово, попробуй угадай, тебе будут показывать по букве.");


        do {
            System.out.println("Введит ваш ответ");
            userAnswer = scanner.nextLine();
            if(userAnswer.equals(computerWord)){
                System.out.println("Вы угадали слово");
                break;
            }
            if(userAnswer != computerWord) {
                System.out.println("Вы не угадали");

            }
            for(int i = 0; i < computerWord.length(); i++){

            }

        }
        while(userAnswer != computerWord);

    }
}

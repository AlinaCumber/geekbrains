import java.util.Random;
import java.util.Scanner;

public class Randome {
    static Random random = new Random();
    static Scanner scanner =  new Scanner(System.in);
    public static void main (String[] args) {
        tryGame();
    }

    public static void tryGame () {
        int count = 3;
        System.out.println("Игра началась!!!");
        int computerNumber = random.nextInt(10);
        do {
            System.out.println("Введие число от 0 до 9, у вас есть " + count + " попытки");
            int userInput = scanner.nextInt();

            if (userInput > computerNumber){
                System.out.println("Вы вели слишком большое число");
                count--;
            }
            else if (userInput < computerNumber){
                System.out.println("Вы ввели слишком маленькое число");
                count--;
            }else{
                System.out.println("Вы выиграли. Хотите сыграть еще раз? Введите 1 если да, 0 если нет");
                int wantPlay = scanner.nextInt();
                if (wantPlay == 0){
                    System.out.println("До скорых встречи");
                    break;
                }else{
                    //count = 3;
                    tryGame();
                }

            }
        } while (count > 0);
        System.out.println("Вы проиграли, хотите сыграть еще раз? Нажмите 1 если да, 0 если нет ");
        int wantPlay = scanner.nextInt();
        if (wantPlay == 1){
            tryGame();

        }else{
            System.out.println("Пока пока");
        }

    }




}

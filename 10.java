import java.util.Scanner;

public class NumberCounter2 {

    public static void main(String[] args) {

        //Дано целое число (например, 1234)
        //Необходимо получить число, в котором те же самые цифры идут в обратной последовательности (то сеть, 4321).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите  4 цифры  ");
        int number = scanner.nextInt();
        do {
            if (number > 9999 || number < 1000) {
                System.out.println(" не верное число  ");
                System.out.println("Пожалуйста, введите 4 цифры   ");
                number = scanner.nextInt();
            }
        } while (number > 9999 || number < 1000);

        int a = number / 1000;
        int b = number / 100 - (a * 10);
        int c = number / 10 - (a * 100) - (b * 10);
        int d = number - (a * 1000) - (b * 100) - (c * 10);


        System.out.println("Reversed Number:  " + d + c + b + a);

    }
}

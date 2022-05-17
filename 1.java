import java.util.Scanner;

public class CheckingNumbers {

    public static void main(String[] args) {
        //Программа, которая проверяет имеют ли числа а, b и с бельше отрицательных и положительных чисел

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите a =  ");
        int a = input.nextInt();
        System.out.println("Пожалуйста, введите b =  ");
        int b = input.nextInt();
        System.out.println("Пожалуйста, введите c =  ");
        int c = input.nextInt();

        if (a > 0 && b > 0 || b > 0 && c > 0 || a > 0 && c > 0) {

            System.out.println("Положительных чисел больше   ");

        } else if (a < 0 && b < 0 || b < 0 && c < 0 || a < 0 && c < 0) {
            System.out.println("Отрицательных чисел больше   ");
        } else {
            System.out.println("Количество отрицательных и положительных чисел одинаково  ");
        }
    }

}

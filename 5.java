import java.util.Scanner;

public class CheckingNumbers5 {
    public static void main(String[] args) {

        //Программа, которая проверяет числа отрицательное или положительное

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите a =  ");
        int a = input.nextInt();
        System.out.println("Пожалуйста, введите b =  ");
        int b = input.nextInt();
        System.out.println("Пожалуйста, введите c =  ");
        int c = input.nextInt();

        if (a > 0) {
            System.out.println(" Число а положительное ");
        } else if (a < 0) {
            System.out.println("Число а отрицательное  ");
        } else {
            System.out.println("Число а  и не отрицательное, и не положительное");
        }
        if (b > 0) {
            System.out.println(" Число b положительное ");
        } else if (b < 0) {
            System.out.println("Число b отрицательное  ");
        } else {
            System.out.println("Число b  и не отрицательное, и не положительное");
        }
        if (c > 0) {
            System.out.println("Число c положительное ");
        } else if (c < 0) {
            System.out.println("Число c отрицательное  ");
        } else {
            System.out.println("Число c  и не отрицательное, и не положительное");
        }

    }
}
import java.util.Scanner;

public class CheckingNumbers4 {

    public static void main(String[] args) {

        //Программа, которая проверяет среди  а, b , с есть ли взаимопротиволожные числа

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите a =  ");
        int a = input.nextInt();
        System.out.println("Пожалуйста, введите b =  ");
        int b = input.nextInt();
        System.out.println("Пожалуйста, введите c =  ");
        int c = input.nextInt();

        if (a + b == 0 || b + c == 0 || a + c == 0) {
            System.out.println("Имеется пара взаимопротиволожных чисел ");

        } else {
            System.out.println("Не имеется пара взаимопротиволожных чисел ");
        }

    }
}

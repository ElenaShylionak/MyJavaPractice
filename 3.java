import java.util.Scanner;

public class CheckingNumbers3 {
    public static void main(String[] args) {

        //Программа, которая проверяет среди  а, b , с есть ли совпадающие числа/ взаимопротиволожные

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите a =  ");
        int a = input.nextInt();
        System.out.println("Пожалуйста, введите b =  ");
        int b = input.nextInt();
        System.out.println("Пожалуйста, введите c =  ");
        int c = input.nextInt();

        if (Math.abs(a) ==  Math.abs(b) ||Math.abs(b) == Math.abs(c)|| Math.abs(a) == Math.abs(c)) {
            System.out.println("Имеется пара совпадающих чисел или взаимопротиволожных ");

               } else {
            System.out.println("Не имеется пара совпадающих чисел или взаимопротиволожных ");
        }

    }
    }

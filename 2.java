iimport java.util.Scanner;

public class CheckingNumbers2 {

    public static void main(String[] args) {
        //Программа, которая проверяет имеют ли числа а, b и с одинаковую четность/нечетность

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите a =  ");
        int a = input.nextInt();
        System.out.println("Пожалуйста, введите b =  ");
        int b = input.nextInt();
        System.out.println("Пожалуйста, введите c =  ");
        int c = input.nextInt();

        int n =Math.abs(a) % 2;
        int n2 = Math.abs(b) % 2;
        int n3 = Math.abs(c) % 2;

        //int n = a - (a / 2) * 2;
        //int n2 = b - (b / 2) * 2;
        //int n3 = c - (c / 2) * 2;

        if (n + n2 +n3 < 2){
            System.out.println("Количество четных больше  ");
        }else {
            System.out.println("Количество нечетных больше  " );
        }

    }
    }

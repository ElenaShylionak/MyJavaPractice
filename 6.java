import java.util.Scanner;

public class CheckingNumbers6 {
    public static void main(String[] args) {

        //Программа, которая проверяет только одно  число отрицательное или положительное

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите a =  ");
        int a = input.nextInt();
        System.out.println("Пожалуйста, введите b =  ");
        int b = input.nextInt();
        System.out.println("Пожалуйста, введите c =  ");
        int c = input.nextInt();

        int d = 0; //положительное
        int q = 0; //отрицательное
        if (a > 0) {
            d++;
        } else if (a < 0) {
            q++;
        }
        if (b > 0) {
            d++;
        } else if (b < 0) {
            q++;
        }
        if (c > 0) {
            d++;
        } else if (c < 0) {
            q++;
        }
        if (d == 1  || q == 1 ) {
            System.out.println("В программе только одно отрицательное или положительное число");
        } else  {
            System.out.println("В программе не только одно отрицательного или положительного числа");
        }
    }

}
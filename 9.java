import java.util.Scanner;

public class NumberCounter3 {
    public static void main(String[] args) {
        //Разработайте программу, которая проверяет, что цифры заданного четырёх-
        // значного числа образуют возрастающую (убывающую) последовательность
        // 1 < 3 < 5 < 7, т.е. идут в порядке возрастания). без массива

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите 4 цифры =  "); //защита от ввода другого числа
        int number = input.nextInt();
        do {
            if (number > 9999 || number < 1000) {
                System.out.println(" не верное число  ");
                System.out.println("Пожалуйста, введите 4 цифры   ");
                number = input.nextInt();
            }
        } while (number > 9999 || number < 1000);


        int a = number / 1000;
        int b = number / 100 - (a * 10);
        int c = number / 10 - (a * 100) - (b * 10);
        int d = number - (a * 1000) - (b * 100) - (c * 10);


        if (a < b && b < c && c < d) {
            System.out.println(" Числа образуют возрастающую последовательность ");
        } else if (a > b && b > c && c > d) {
            System.out.println("Числа образуют убывающую последовательность ");
        } else {
            System.out.println("Числа не образуют возрастающую (убывающую) последовательность");
        }

    }

}

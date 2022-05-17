import java.util.Scanner;

public class CheckingPointWithCoordinates {

    public static void main(String[] args) {
        //Разработайте программу, которая проверяет, что точка с координатами (x, y)
        //лежит в какой координатной четверти.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите  координату  х точки  ");
        int x = scanner.nextInt();
        System.out.println("Пожалуйста, введите  координату  y точки  ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("точка с координатами (x, y) лежит в I координатной четверти");
        } else if (x < 0 && y > 0){
            System.out.println("точка с координатами (x, y) лежит в II координатной четверти");
        } else if (x < 0 && y < 0){
            System.out.println("точка с координатами (x, y) лежит в III координатной четверти");
        } else if (x > 0 && y < 0){
            System.out.println("точка с координатами (x, y) лежит в IV координатной четверти");
        }else{
            System.out.println("точка является началом координат");
        }


    }

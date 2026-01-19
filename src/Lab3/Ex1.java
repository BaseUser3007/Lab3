package Lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        boolean isCorrectNumber = false;
        int dayNumber = 0;


        while(isCorrectNumber == false){
            System.out.print("Введите день недели:");
            dayNumber = in.nextInt();
            if(dayNumber >= 1 && dayNumber <= 7)
                isCorrectNumber = true;
            else
                System.out.println("Введено некорректное значение");

        }

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
    }
}

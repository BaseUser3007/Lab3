package Lab3;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        FirstWay();
        SecondWay();
    }

    public static void FirstWay(){
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Введите день недели:");
            String dayName = in.nextLine().toLowerCase();
            switch (dayName) {
                case "понедельник":
                    System.out.println(1);
                    return;
                case "вторник":
                    System.out.println(2);
                    return;
                case "среда":
                    System.out.println(3);
                    return;
                case "четверг":
                    System.out.println(4);
                    return;
                case "пятница":
                    System.out.println(5);
                    return;
                case "суббота":
                    System.out.println(6);
                    return;
                case "воскресенье":
                    System.out.println(7);
                    return;
                default:
                    System.out.println("Введено некорректное значение");
                    break;
            }
        }
    }

    public static void SecondWay(){
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Введите день недели:");
            String dayName = in.nextLine().toLowerCase();
            if(dayName.equals("понедельник")) {
                System.out.println(1);
                return;
            }
            else if(dayName.equals("вторник")) {
                System.out.println(2);
                return;
            }
            else if(dayName.equals("среда")) {
                System.out.println(3);
                return;
            }
            else if(dayName.equals("четверг")) {
                System.out.println(4);
                return;
            }
            else if(dayName.equals("пятница")) {
                System.out.println(5);
                return;
            }
            else if(dayName.equals("суббота")) {
                System.out.println(6);
                return;
            }
            else if(dayName.equals("воскресенье")) {
                System.out.println(7);
                return;
            }
            else
                System.out.println("Введено некорректное значение");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String iDoNotKnow ;
        final int NUM = 5;
        String word = " Kitties ";
        iDoNotKnow = (NUM + word);
        System.out.println(iDoNotKnow + " is " + NUM + word);
        if (NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM>0){
            System.out.println("Вы сохранили положительное чиисло");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String string = s.nextLine();
        System.out.println("Привет " + string);
    }
}
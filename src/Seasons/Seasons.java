package Seasons;

import java.util.Arrays;
import java.util.Scanner;

public class Seasons {
String [] seasons ={"Spring","Summer","Autumn","Winter "};

    public Seasons(String[] seasons) {
        this.seasons = seasons;
    }

    public static void Seasons04(String[] seasons){
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите номер месяца: ");

        int moth= sc.nextInt();
        if (moth == 3 || moth==4||moth==5){
            System.out.println(seasons[0]);
        }else if (moth == 6 || moth==7||moth==8) {
            System.out.println(seasons[1]);
        } else if (moth == 9 || moth==10||moth==11) {
        System.out.println(seasons[2]);
        }else if (moth == 1 || moth==2||moth==12) {
            System.out.println(seasons[3]);
        }else if (moth>=13){
            String a="Создайте обьект в Main класс и вызовите";
            System.out.println(a);
        }
}}


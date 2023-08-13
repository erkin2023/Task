package Seasons;

import Conpany.Group;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] seasons05 ={"Spring","Summer","Autumn","Winter "};
        Seasons seasons = new Seasons(seasons05);
        Seasons.Seasons04(seasons05);
        System.out.println(Arrays.toString(seasons05));

    }
}

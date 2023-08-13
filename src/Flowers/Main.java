package Flowers;

public class Main {
    public static void main(String[] args) {
        //3) Flowers.Flowers
 Flowers flowers1 = new Flowers("Роза   ", 9,3990);
        Flowers flowers2 = new Flowers("Ромашка", 10,2990);
        Flowers flowers3 = new Flowers("Пионы  ", 8,1590);
        Flowers flowers4 = new Flowers("Лилии  ", 6,1490);
        int[] newArrayFreshness={flowers1.freshness,flowers2.freshness,flowers3.freshness,flowers4.freshness};

        Flowers[] array = new Flowers[]{flowers1, flowers2, flowers3, flowers4};
        System.out.println("Минимальный цена цветов : ");
        System.out.println(Flowers.minPriceFlower(array));
        System.out.println("Сортировка пи имени и вывод светов по свежести  : ");
        Flowers.checkFreshness(array,newArrayFreshness);

    }
}

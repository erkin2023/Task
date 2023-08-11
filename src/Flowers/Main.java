package Flowers;

public class Main {
    public static void main(String[] args) {
        //3) Flowers.Flowers
 Flowers flowers1 = new Flowers("Роза   ", 3990);
        Flowers flowers2 = new Flowers("Ромашка", 2990);
        Flowers flowers3 = new Flowers("Пионы  ", 1590);
        Flowers flowers4 = new Flowers("Лилии  ", 1490);

        Flowers[] array = new Flowers[]{flowers1, flowers2, flowers3, flowers4};
        System.out.println(Flowers.minPriceFlower(array));
        System.out.println(Flowers.checkFreshness(array));

    }
}

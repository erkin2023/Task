package Flowers;

public class Flowers {
    public static boolean flowersName;
    public Object freshnessStatus;
    String flowerName;
    int freshness;
    int price;

    public Flowers(String flowerName, int price) {
        this.flowerName = flowerName;
        this.price = price;

    }


    public static String checkFreshness(Flowers[] flowers) {
        System.out.println("Свежесть цветов:");
        int maxFreshness = flowers.length; // Change variable name to maxFreshness
        String name = flowers[0].flowerName;

        // Freshness thresholds
        for (int i = 1; i < flowers.length; i++) {
            if (flowers[i].freshness > maxFreshness) { // Use ">" to find highest freshness
                maxFreshness = flowers[i].freshness;
                name = flowers[i].flowerName;
            }
        }
        return "Самый свежий цветок: " + name + " по 10-балльной шкале: " + maxFreshness; // Change message accordingly
    }

    public static Flowers minPriceFlower(Flowers[] flowers) {
        System.out.println("минимальный price ");
        Flowers flower = flowers[0];
        for (int i = 1; i < flowers.length; i++) {
            if (flowers[i].price < flower.price) {
                flower = flowers[i];

            }
        }
        return flower;
    }@Override
    public String toString() {
        return "Flowers.Flowers{" +
                "flowerName='" + flowerName + '\'' +
                ", freshness='" + freshness + " out of 10'" +
                ", price=" + price +
                '}';
    }}


package Flowers;

public class Flowers {
    String flowersName;
    int freshness;
    int price;

    public Flowers(String flowerName, int freshness, int price) {
        this.flowersName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }public static void checkFreshness(Flowers[] flowersArray, int[] freshnessArray) {
        System.out.println("Свежесть цветов:");

        for (int i = 0; i < freshnessArray.length - 1; i++) {
            for (int j = 0; j < freshnessArray.length - i - 1; j++) {
                if (flowersArray[j].flowersName.compareTo(flowersArray[j + 1].flowersName) > 0) {
                    // Меняем элементы местами
                    int temp = freshnessArray[j];
                    freshnessArray[j] = freshnessArray[j + 1];
                    freshnessArray[j + 1] = temp;

                    // Меняем связанные имена цветов местами в массиве flowersArray
                    Flowers tempFlower = flowersArray[j];
                    flowersArray[j] = flowersArray[j + 1];
                    flowersArray[j + 1] = tempFlower;
                }
            }
        }

        // Теперь можно вывести отсортированные цветы и их свежесть
        for (int i = 0; i < flowersArray.length; i++) {
            System.out.println(flowersArray[i].flowersName + ": " + freshnessArray[i]);
        }
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
                "flowerName='" + flowersName + '\'' +
                ", freshness='" + freshness + " out of 10'" +
                ", price=" + price +
                '}';
    }}


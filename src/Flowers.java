public class Flowers {
    String flowerName;
    int freshness;
    int price;

    public Flowers(String flowerName, int freshness, int price) {
        this.flowerName = flowerName;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Flowers{" +
                "flowerName='" + flowerName + '\'' +
                ", freshnessStatus='" + freshness + '\'' +
                ", price=" + price +
                '}';
    }
}


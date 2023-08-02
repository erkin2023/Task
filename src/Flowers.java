public class Flowers {
    String flowerName;
    String freshnessStatus;
    int price;

    public Flowers(String flowerName, String freshness, int price) {
        this.flowerName = flowerName;
        this.price = price;
        this.freshnessStatus = freshnessStatus;

    }

    @Override
    public String toString() {
        return "Flowers{" +
                "flowerName='" + flowerName + '\'' +
                ", freshnessStatus='" + freshnessStatus + '\'' +
                ", price=" + price +
                '}';
    }
}


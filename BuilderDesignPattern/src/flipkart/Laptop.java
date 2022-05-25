package flipkart;

public class Laptop {
    private String os;
    private int price;
    private  String processor;
    private  int ram;
    private float size;

    public Laptop(String os, int price, String processor, int ram, float size) {
        this.os = os;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", size=" + size +
                '}';
    }
}

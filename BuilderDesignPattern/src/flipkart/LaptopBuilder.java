package flipkart;

public class LaptopBuilder {
    private String os;
    private int price;
    private  String processor;
    private  int ram;
    private float size;

    public LaptopBuilder setOs(String os) {
        this.os = os;
        return  this;
    }

    public LaptopBuilder setPrice(int price) {
        this.price = price;
        return  this;
    }

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return  this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return  this;
    }

    public LaptopBuilder setSize(float size) {
        this.size = size;
        return  this;
    }

    public Laptop getLaptop(){
        return new Laptop(os, price, processor, ram, size);
    }
}

package flipkart;

public class flipkart {
    public static void main(String[] args) {


      //Laptop laptop = new Laptop("windows", 40000, "amd ryzen 7", 8, 12);

        Laptop laptop = new LaptopBuilder().setRam(2).setProcessor("ryzen 7").getLaptop();
        System.out.println(laptop);
    }
}

// "construct a complex object from simple objects using step-by-step approach"

  /*  The main advantages of Builder Pattern are as follows:

        It provides clear separation between the construction and representation of an object.
        It provides better control over construction process.
        It supports to change the internal representation of objects. */
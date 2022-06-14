package composite;

public class CompositeMain {
    public static void main(String[] args) {

        Component gpu = new Leaf(50000, "Zotac3060");
        Component mouse = new Leaf(2000, "Logitech g250");
        Component monitor = new Leaf(30000, "HP BENQ");
        Component  ram= new Leaf(5000, "RPG 8Gb");
        Component cpu = new Leaf(15000, "intel i7f 12gen");
        Component keyboard = new Leaf(3000, "Hp GK100");
        Component powerSupply = new Leaf(5000, "650W Power Supply");

        Composite peripheral = new Composite("peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        peripheral.addComponent(keyboard);

        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);
        motherboard.addComponent(gpu);

        cabinet.addComponent(powerSupply);
        cabinet.addComponent(motherboard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        // ram.showPrice();
        peripheral.showPrice();
        //computer.showPrice();

    }
}

/* It defines class hierarchies that contain primitive and complex objects.
It makes easier to you to add new kinds of components.
It provides flexibility of structure with manageable class or interface. */
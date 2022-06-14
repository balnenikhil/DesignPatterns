package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c:components)
        {
            c.showPrice();
        }
    }

    public void addComponent(Component component){
        components.add(component);
    }
}

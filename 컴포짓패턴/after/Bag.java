package 컴포짓패턴.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    // Leaf가 아닌 Component 타입의 객체를 가져야 한다.
    private List<Component> components = new ArrayList<>();
    ;

    void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}

package structural.composite.ex1;

import java.util.HashMap;
import java.util.Map;

public class Composite extends Component {
    public Map<String, Component> children = new HashMap<>();

    public Composite(String name) {
        this.setName(name);
    }

    public void addNode(Component folder) {
        this.children.put(folder.getName(), folder);
    }

    public void removeNode(Component component) {
        this.children.remove(component.getName());
    }

    public boolean isNode() {
        return !this.children.isEmpty();
    }
}

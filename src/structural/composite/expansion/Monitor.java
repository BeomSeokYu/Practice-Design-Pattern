package structural.composite.expansion;

import java.util.ArrayList;
import java.util.List;

public class Monitor {
    public String name = "모니터";
    public List<Screen> screens = new ArrayList<>();

    public void addMonitor(Screen monitor) {
        screens.add(monitor);
    }

    public void show() {
        for (Screen part : screens) {
            System.out.println(part.getName());
        }
    }
}

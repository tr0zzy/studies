package homeWork7._ex3;

import java.util.ArrayList;
import java.util.List;

public class TextEditor{
    private List<Plugin> plugins = new ArrayList<>();

    public void addPlugin(Plugin plugin) {
        plugins.add(plugin);
    }

    public void run(String text) {
        for (Plugin plugin : plugins) {
            plugin.apply(text);
        }
    }
}

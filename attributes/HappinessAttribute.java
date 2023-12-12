package attributes;

import interfaces.Attribute;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.Serializable;

public class HappinessAttribute implements Attribute, Serializable {
    private int value;
    private static final Map<Integer, String> levelDescriptions = new HashMap<>();

    static {
        levelDescriptions.put(0, "Very Sad");
        levelDescriptions.put(1, "Sad");
        levelDescriptions.put(2, "Neutral");
        levelDescriptions.put(3, "Happy");
        levelDescriptions.put(4, "Very Happy");
        levelDescriptions.put(5, "Excited");
    }

    public HappinessAttribute() {
        this.value = 0;
    }

    @Override
    public void incrementValue() {
        value++;
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        return levelDescriptions.getOrDefault(key, "Unknown");
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}

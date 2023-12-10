package attributes; // Ensure you have the correct package declaration

import interfaces.Attribute;

public class HungerAttribute implements Attribute {
    private int value; // Represents the hunger level

    public HungerAttribute() {
        this.value = 0; // Initialize hunger to a default value
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
        // Assuming you have a map of hunger levels and corresponding descriptions
        // For example: {0: "Not hungry", 1: "A little hungry", 2: "Very hungry"}
        // You can use 'key' to retrieve the description from your map
        // Replace this with your actual logic
        return "Custom logic to get hunger value description";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}

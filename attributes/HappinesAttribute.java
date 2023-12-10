package attributes; // Ensure you have the correct package declaration

import interfaces.Attribute;

public class HappinessAttribute implements Attribute {
    private int value; // Represents the happiness level

    public HappinessAttribute() {
        this.value = 0; // Initialize happiness to a default value
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
        // Assuming you have a map of happiness levels and corresponding descriptions
        // For example: {0: "Not happy", 1: "Somewhat happy", 2: "Very happy"}
        // You can use 'key' to retrieve the description from your map
        // Replace this with your actual logic
        return "Custom logic to get happiness value description";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}

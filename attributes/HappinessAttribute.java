package attributes;

import interfaces.Attribute;

public class HappinessAttribute implements Attribute {
    private int value;

    public HappinessAttribute() {
        this.value = 0;
    }

    @Override
    public void incrementValue() {
        value++;
        // Add logic here to cap the value at a maximum if needed
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        switch (value) {
            case 0:
                return "Sad";
            case 1:
                return "Happy";
            case 2:
                return "Very Happy";
            default:
                return "Unknown"; // Or handle other cases as needed
        }
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}

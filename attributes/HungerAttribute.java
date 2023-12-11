package attributes;

import interfaces.Attribute;

public class HungerAttribute implements Attribute {
    private int value;

    public HungerAttribute() {
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
                return "Not Hungry";
            case 1:
                return "A little Hungry";
            case 2:
                return "Very Hungry";
            default:
                return "Unknown"; // Or handle other cases as needed
        }
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}

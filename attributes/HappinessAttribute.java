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
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        return "Custom logic to get happiness value description";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}
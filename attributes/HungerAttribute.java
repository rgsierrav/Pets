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
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        return "Custom logic to get hunger value description";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }
}
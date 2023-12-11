package interfaces; 

public interface Attribute {
    void incrementValue();
    void decrementValue();
    String getValue(Integer key);
    Integer getCurrentValue();
}
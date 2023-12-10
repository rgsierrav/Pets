package interfaces; // Ensure you have the correct package declaration

public interface Attribute {
    void incrementValue();
    void decrementValue();
    String getValue(Integer key);
    Integer getCurrentValue();
}

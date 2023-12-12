package interfaces;

/**
 * Interface representing a generic attribute.
 */
public interface Attribute {
    //Increments the value of the attribute.
    void incrementValue();

    /**
     * Decrements the value of the attribute.
     */
    void decrementValue();

    /**
     * Returns a string representation of the attribute's value.
     * @param key The key or parameter to determine the string representation.
     * @return String representation of the attribute's value.
     */
    String getValue(Integer key);

    /**
     * Gets the current numerical value of the attribute.
     * @return The current value of the attribute.
     */
    Integer getCurrentValue();
}

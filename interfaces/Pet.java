package interfaces;

import enums.Color;

public interface Pet {
    void play();
    void feed();
    void makeSound();
    Attribute getPrimaryAttribute();
    Attribute getSecondaryAttribute();
    Color getColor();
}

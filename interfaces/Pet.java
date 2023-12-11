package interfaces; 

import enums.Color;
import interfaces.Attribute;

public interface Pet {
    void play();
    void feed();
    void makeSound();
    Attribute getAttribute1();
    Attribute getAttribute2();
    Color getColor();
}
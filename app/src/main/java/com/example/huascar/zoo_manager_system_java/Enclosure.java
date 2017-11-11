package com.example.huascar.zoo_manager_system_java;

import java.util.ArrayList;

/**
 * Created by huascar on 11/11/2017.
 */

public class Enclosure<T extends Animal> {

    ArrayList<T> enclosure;

    public Enclosure(ArrayList<T> enclosure) {
        this.enclosure = enclosure;
    }

    public void add(T animal) {
        enclosure.add(animal);
    }

    public int numberOfAnimals() {
        int actual = enclosure.size();
        return actual;
    }
}

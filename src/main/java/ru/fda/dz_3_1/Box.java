package ru.fda.dz_3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<N extends Fruit> {
    Apple apple = new Apple();
    Orange orange = new Orange();

    private float boxWeight = 0.0f;
    private List<N> box;

    public Box(N... items) {
        this.box = new ArrayList<>(Arrays.asList(items));
    }

    public float getWeight() {
        float fruitsWeight = 0.0f;
        if (box.get(0).getClass().equals(apple.getClass())) {
            fruitsWeight = apple.getWeight();
        } else {
            fruitsWeight = orange.getWeight();
        }
        boxWeight = fruitsWeight * box.size();
        return boxWeight;
    }

    public boolean compare(Box firstBox, Box otherBox) {
        return Math.abs(firstBox.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void shiftBox(Box<N> box) {
        box.box.addAll(this.box);
        this.box.clear();
    }

    public void addToBox(N n) {
        box.add(n);
    }
}

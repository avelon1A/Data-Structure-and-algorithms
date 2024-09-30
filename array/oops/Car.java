package array.oops;

import java.util.ArrayList;
import java.util.List;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

 class Car {
    private Engine engine; // Car has an Engine
    private List<Wheel> wheels; // Car has Wheels

    public Car(String engineType, int wheelSize) {
        this.engine = new Engine(engineType);
        this.wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel(wheelSize)); // Create 4 wheels
        }
    }

    public void displayDetails() {
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Wheel Size: " + wheels.get(0).getSize());
    }
}

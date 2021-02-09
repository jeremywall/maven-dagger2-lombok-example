package com.jeremywall.maven_dagger2_lombok_example;

public class App {

    public static void main(String[] args) {

        new App().go();
    }

    private Car car;

    public void go() {

        CarComponent component = DaggerCarComponent.create();

        car = component.getCar();
        car.drive();
    }
}

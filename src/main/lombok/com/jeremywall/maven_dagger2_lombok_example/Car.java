package com.jeremywall.maven_dagger2_lombok_example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Inject;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(onConstructor_ = @Inject)
public class Car {
    private static final String TAG = "Car";

    Engine engine;
    Wheels wheels;

//    @Inject
//    public Car(
//            Engine engine,
//            Wheels wheels,
//            Color color) {
//
//        this.engine = engine;
//        this.wheels = wheels;
//    }

    public void drive() {

        System.out.println(TAG + " driving...");
    }
}

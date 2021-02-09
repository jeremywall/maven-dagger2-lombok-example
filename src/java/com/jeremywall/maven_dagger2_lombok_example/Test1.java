package com.jeremywall.maven_dagger2_lombok_example;

public class Test1 {

  @Test
  public void test1() {
    CarComponent component = DaggerCarComponent.create();
    Car car = component.getCar();
    car.drive();
  }
}

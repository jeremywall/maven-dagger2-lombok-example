package com.jeremywall.maven_dagger2_lombok_example;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception {

        Car car = new Car("2015", "Ferrari", "458 Speciale");

        car = new Car("2012", "Tesla", "Model S");

        car = new Car("1983", "Suzuki", "Swift");
        repository.save(car);
    }
}

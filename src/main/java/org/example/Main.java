package org.example;

import org.example.Dao.CarDao;
import org.example.Model.Car;

import java.time.LocalDate;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setNumber("A 980 AA 190 RUS");
        car.setDate(LocalDate.now());

        CarDao dao = new CarDao();
        //dao.create(car);

        Car getCar = dao.getCar();
        System.out.println(getCar);
    }
}

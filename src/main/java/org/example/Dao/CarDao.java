package org.example.Dao;

import Utils.DbConnector;
import org.example.Model.Car;

import javax.persistence.EntityManager;

public class CarDao {

    /**
     * Метод создания записи о машине в таблице.
     * @param car - объект класса "Машина".
     */
    public void create(Car car) {
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();
    }

    /**
     * Метод вывода данных о конкретной машине (по идентификатору) из таблицы (используется для тестов).
     * @return car - определённый объект класса "Машина" из таблицы.
     */
    public Car getCar() {
        EntityManager entityManager = DbConnector.getEntityManager();
        Car car = entityManager.find(Car.class, 9);
        return car;
    }
}


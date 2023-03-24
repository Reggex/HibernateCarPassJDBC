import net.bytebuddy.utility.RandomString;
import org.example.Dao.CarDao;
import org.example.Model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


/**
 * Unit-тесты для Dao-класса автомобиля.
 */
public class CarDaoTest {

    private final CarDao carDao = new CarDao();

    /**
     * Тест на создание машины, проверку и получение данных машины.
     */
    @Test
    public void createAndGetTest() {
        String carNumber = "B 222 BB 790 RUS";
        LocalDate date = LocalDate.now();
        Car car = new Car(carNumber,date);
        Assertions.assertDoesNotThrow(() -> carDao.create(car));

        Car createdCar = carDao.getCar();
        Assertions.assertNotNull(createdCar);
        Assertions.assertEquals(createdCar.getNumber(), carNumber);
        Assertions.assertEquals(createdCar.getDate(), date);
        Assertions.assertTrue(createdCar.getId() > 8);
    }

    /**
     * Тест на значения null.
     */
    @Test
    public void createWithNullDataTest() {
        Car car = new Car(null, null);
        Assertions.assertThrows(Exception.class, () -> carDao.create(car));
        Car car1 = new Car("T 998 TT 12 RUS", null);
        Assertions.assertThrows(Exception.class, () -> carDao.create(car1));
        Car car2 = new Car(null, LocalDate.now());
        Assertions.assertThrows(Exception.class, () -> carDao.create(car2));
    }


}

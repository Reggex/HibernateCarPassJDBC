package org.example.Model;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Класс "Машина".
 */
@Entity
@Table(name = "CAR")
public class Car {

    /**
     * id - идентификатор машины.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * number - регистрационный номер машины.
     */
    @Column(name = "REGISTRATION_NUMBER")
    private String number;

    /**
     * date - дата въезда машины.
     */
    @Column(name = "PASS_DATE")
    private LocalDate date;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", date=" + date +
                '}';
    }

    /**
     * Конструктор с параметрами (используется в тестах).
     * @param number - регистрационный номер машины.
     * @param date - дата въезда машины.
     */
    public Car(String number, LocalDate date) {
        this.number = number;
        this.date = date;
    }

    /**
     * Конструктор по умолчанию
     */
    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

package com.example.shurik.adaptertest.item;

/**
 * Created by user on 24.10.2017.
 */

public class Sotrudnik {

    private int id;

    private String name;
    private Car car;
    private String phone;
    private String sex;


    public Sotrudnik() {
    }

    public Sotrudnik(int id, String name, String phone, String sex) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }

    public Sotrudnik(int id, String name, String phone, String sex, Car car) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sotrudnik sotrudnik = (Sotrudnik) o;

        if (id != sotrudnik.id) return false;
        if (name != null ? !name.equals(sotrudnik.name) : sotrudnik.name != null) return false;
        if (car != null ? !car.equals(sotrudnik.car) : sotrudnik.car != null) return false;
        if (phone != null ? !phone.equals(sotrudnik.phone) : sotrudnik.phone != null) return false;
        return sex != null ? sex.equals(sotrudnik.sex) : sotrudnik.sex == null;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Sotrudnik{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", phone='" + phone + '\'' +
                ", sex='" + sex +
                '}';
    }
}


public class Car{

    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        return name != null ? name.equals(car.name) : car.name == null;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
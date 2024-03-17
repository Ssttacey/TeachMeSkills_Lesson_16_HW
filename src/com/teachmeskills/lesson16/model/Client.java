package com.teachmeskills.lesson16.model;

import com.teachmeskills.lesson16.fabric.OrderCreation;

import java.util.List;

public class Client {
    private String registrationDate;
    private String name;
    private int age;
    private List<OrderCreation> clientOrder;

    public Client(String registrationDate, String name, int age, List<OrderCreation> clientOrder) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.clientOrder = clientOrder;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<OrderCreation> getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(List<OrderCreation> clientOrder) {
        this.clientOrder = clientOrder;
    }

    @Override
    public String toString() {
        return "Client{" +
                "registrationDate='" + registrationDate + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clientOrder=" + clientOrder +
                '}';
    }
}

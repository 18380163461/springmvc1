package com.pd.smvc.entity;

public class User {
    private String name;
    private String age;
    private Address address;

    public User() {
    }

    public User(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

package controller;

import model.Female;

public interface UserController <T>{

    T createUser(String name, String lastName, int age);
    void showUser(T t);
    void saveUser(T t);
    void userReport(T t);
}

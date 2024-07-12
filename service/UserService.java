package service;

import model.User;

public interface UserService<T extends User>{

    T createUser(String name,String lastName,int age);
    void showUser(T t);
    T saveUser(T t);
    void userReport(T t);

}

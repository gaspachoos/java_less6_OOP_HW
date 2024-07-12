package service;


import model.User;

public interface PersisterService<T extends User> {

    void save(T t);
}

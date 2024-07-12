package service;

import model.Male;

public class MaleService implements UserService<Male> {


    @Override
    public Male createUser(String name, String lastName, int age) {
        return new Male(name, lastName, age);
    }

    @Override
    public void showUser(Male male) {
        male.getUser();
    }

    @Override
    public Male saveUser(Male male) {
        return null;
    }

    @Override
    public void userReport(Male male) {
        System.out.println("Report for user: " + male.getName());

    }
}

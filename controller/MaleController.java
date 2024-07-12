package controller;

import model.Female;
import model.Male;
import service.MaleService;
import service.PersisterMaleService;

public class MaleController implements UserController<Male>{

    private final MaleService maleService = new MaleService();
    private PersisterMaleService persisterMaleService = new PersisterMaleService();

    @Override
    public Male createUser(String name, String lastName, int age) {
        return  maleService.createUser(name, lastName, age);

    }

    @Override
    public void showUser(Male male) {
        maleService.showUser(male);
    }

    @Override
    public void saveUser(Male male) {
        persisterMaleService.save(male);
    }

    @Override
    public void userReport(Male male) {
        maleService.userReport(male);
    }
}

package controller;

import model.Female;
import service.FemaleService;
import service.PersisterFemaleService;

public class FemaleController implements UserController<Female>{

    private final FemaleService femaleService = new FemaleService();
    private PersisterFemaleService persisterFemaleService = new PersisterFemaleService();

    @Override
    public Female createUser(String name, String lastName, int age) {
        return femaleService.createUser(name, lastName, age);

    }

    @Override
    public void showUser(Female female) {
        femaleService.showUser(female);
    }

    @Override
    public void saveUser(Female female) {
        persisterFemaleService.save(female);
    }

    @Override
    public void userReport(Female female) {
        femaleService.userReport(female);
    }
}

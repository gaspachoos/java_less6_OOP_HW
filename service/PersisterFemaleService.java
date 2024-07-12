package service;

import model.Female;
import model.persister.Persister;

public class PersisterFemaleService implements PersisterService<Female>{
    Persister persister = new Persister();

    @Override
    public void save(Female female) {
        persister.femalesPersister.add(female);
        System.out.println("Female saved successfully");
    }
}

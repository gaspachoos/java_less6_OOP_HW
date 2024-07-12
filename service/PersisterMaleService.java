package service;

import model.Male;
import model.persister.Persister;

public class PersisterMaleService implements PersisterService<Male>{

    Persister persister = new Persister();
    @Override
    public void save(Male male) {
        persister.malesPersister.add(male);
        System.out.println("Male saved successfully");
    }
}

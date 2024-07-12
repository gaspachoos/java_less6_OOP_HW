package service;

import model.Female;

public class FemaleService implements UserService<Female>{


    @Override
    public Female createUser(String name,String lastName,int age){
       return new Female(name,lastName,age);
    }

    @Override
    public void showUser(Female female) {
        female.getUser();
    }

    @Override
    public Female saveUser(Female female) {
        return null;
    }

    @Override
    public void userReport(Female female) {
        System.out.println("Report for user: " + female.getName());

    }
}

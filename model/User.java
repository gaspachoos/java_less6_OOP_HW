package model;

public abstract class User<T extends User<T>> {

    protected String name;
    protected String lastName;
    protected int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public void getUser(){
        System.out.println("name : " + name + ", lastName : " + lastName + ", age : " + age);
    }

    public String getName() {
        return name;
    }
}

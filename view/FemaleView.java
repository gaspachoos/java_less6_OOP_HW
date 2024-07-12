package view;

import controller.FemaleController;
import model.Female;

import java.util.Scanner;

public class FemaleView {

    public FemaleController femaleController = new FemaleController();

    public Female createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        Female female = femaleController.createUser(name, lastName, age);
        femaleController.showUser(female);
        return female;
    }

    private void femaleSaveChoice() {
        while (true) {
            Female female = createUser();
            System.out.println("Do you want to save account? press 1: ");
            System.out.println("Do you want go back? press 2: ");
            System.out.println("Do you want to exit? press 3: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> {
                    femaleController.saveUser(female);
                    femaleChoice(female);
                }
                case 2 -> startFemaleView();
                case 3 -> {
                    System.out.println("Bye Bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid option");
            }
        }
    }

    public void femaleChoice(Female female) {
        while (true) {
            System.out.println("Do you want to see report? press 1: ");
            System.out.println("Do you want go back? press 2: ");
            System.out.println("Do you want to exit? press 3: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> femaleController.userReport(female);
                case 2 -> startFemaleView();
                case 3 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid option");
            }
        }
    }

    public void startFemaleView() {
        while (true) {
            System.out.println("Do you want to create account? press 1: ");
            System.out.println("Do you want go back? press 2: ");
            System.out.println("Do you want to exit? press 3: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> femaleSaveChoice();
                case 2 -> new EnterView().start();
                case 3 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid option");
            }
        }
    }
}

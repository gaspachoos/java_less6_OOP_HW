package view;

import controller.MaleController;
import model.Male;

import java.util.Scanner;

public class MaleView {

    public MaleController maleController = new MaleController();

    public Male createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        Male male = maleController.createUser(name, lastName, age);
        maleController.showUser(male);
        return male;
    }

    private void maleSaveChoice() {
        while (true) {
            Male male = createUser();
            System.out.println("Do you want to save account? press 1: ");
            System.out.println("Do you want go back? press 2: ");
            System.out.println("Do you want to exit? press 3: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> {
                    maleController.saveUser(male);
                    maleChoice(male);
                }
                case 2 -> startMaleView();
                case 3 -> {
                    System.out.println("Bye Bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid option");
            }
        }
    }

    public void maleChoice(Male male) {
        while (true) {
            System.out.println("Do you want to see report? press 1: ");
            System.out.println("Do you want go back? press 2: ");
            System.out.println("Do you want to exit? press 3: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> maleController.userReport(male);
                case 2 -> startMaleView();
                case 3 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid option");
            }
        }
    }

    public void startMaleView() {
        while (true) {
            System.out.println("Do you want to create account? press 1: ");
            System.out.println("Do you want go back? press 2: ");
            System.out.println("Do you want to exit? press 3: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> maleSaveChoice();
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

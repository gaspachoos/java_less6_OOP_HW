package view;

import java.util.Scanner;

public class EnterView {

    public void start() {

        while (true) {

            System.out.println("Male - press 1");
            System.out.println("Female - press 2");
            System.out.println("Exit - press 3");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1 -> new MaleView().startMaleView();
                case 2 -> new FemaleView().startFemaleView();
                case 3 -> {
                    System.out.println("Bye Bye!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid option");
            }

        }

    }
}

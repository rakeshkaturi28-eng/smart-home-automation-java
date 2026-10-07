import java.util.Scanner;

class Device {
    String name;
    boolean status;

    Device(String name) {
        this.name = name;
        this.status = false;
    }

    void turnOn() {
        status = true;
        System.out.println(name + " is turned ON.");
    }

    void turnOff() {
        status = false;
        System.out.println(name + " is turned OFF.");
    }

    void showStatus() {
        if (status) {
            System.out.println(name + " : ON");
        } else {
            System.out.println(name + " : OFF");
        }
    }
}

public class SmartHome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Device light = new Device("Light");
        Device fan = new Device("Fan");
        Device ac = new Device("AC");
        Device door = new Device("Door");

        int choice;

        do {
            System.out.println("\n===== SMART HOME AUTOMATION =====");
            System.out.println("1. Turn Light ON");
            System.out.println("2. Turn Light OFF");
            System.out.println("3. Turn Fan ON");
            System.out.println("4. Turn Fan OFF");
            System.out.println("5. Turn AC ON");
            System.out.println("6. Turn AC OFF");
            System.out.println("7. Open Door");
            System.out.println("8. Close Door");
            System.out.println("9. Show Device Status");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    light.turnOn();
                    break;

                case 2:
                    light.turnOff();
                    break;

                case 3:
                    fan.turnOn();
                    break;

                case 4:
                    fan.turnOff();
                    break;

                case 5:
                    ac.turnOn();
                    break;

                case 6:
                    ac.turnOff();
                    break;

                case 7:
                    door.turnOn();
                    break;

                case 8:
                    door.turnOff();
                    break;

                case 9:
                    System.out.println("\n--- Device Status ---");
                    light.showStatus();
                    fan.showStatus();
                    ac.showStatus();
                    door.showStatus();
                    break;

                case 0:
                    System.out.println("Exiting Smart Home System...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
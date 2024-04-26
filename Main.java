import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter manager details:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Work Bonus: ");
        int managerWorkBonus = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Holidays: ");
        String managerHolidays = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerSalary, managerAddress, managerWorkBonus, managerHolidays);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Work Bonus: " + manager.getWorkBonus());
        System.out.println("Holidays: " + manager.getHolidays());

        
    }
}

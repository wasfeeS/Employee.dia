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

        System.out.println("\nEnter full-time employee details:");
        System.out.print("Name: ");
        String fullTimeName = scanner.nextLine();
        System.out.print("Age: ");
        int fullTimeAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Salary: ");
        double fullTimeSalary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Address: ");
        String fullTimeAddress = scanner.nextLine();
        System.out.print("Overtime Bonus: ");
        double overtimeBonus = scanner.nextDouble();
        scanner.nextLine(); 

        FullTime fullTime = new FullTime(fullTimeName, fullTimeAge, fullTimeSalary, fullTimeAddress, overtimeBonus);

        System.out.println("\nFull-Time Employee Details:");
        System.out.println("Name: " + fullTime.getName());
        System.out.println("Age: " + fullTime.getAge());
        System.out.println("Salary: " + fullTime.getSalary());
        System.out.println("Address: " + fullTime.getAddress());
        System.out.println("Overtime Bonus: " + fullTime.getOvertimeBonus());

        System.out.println("\nEnter part-time employee details:");
        System.out.print("Name: ");
        String partTimeName = scanner.nextLine();
        System.out.print("Age: ");
        int partTimeAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Salary: ");
        double partTimeSalary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Address: ");
        String partTimeAddress = scanner.nextLine();
        System.out.print("End Date: ");
        String endDate = scanner.nextLine();

        PartTime partTime = new PartTime(partTimeName, partTimeAge, partTimeSalary, partTimeAddress, endDate);

        System.out.println("\nPart-Time Employee Details:");
        System.out.println("Name: " + partTime.getName());
        System.out.println("Age: " + partTime.getAge());
        System.out.println("Salary: " + partTime.getSalary());
        System.out.println("Address: " + partTime.getAddress());
        System.out.println("End Date: " + partTime.getEndDate());

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 35, 5000.0, "123 Main St", 1000, "2 weeks");
        System.out.println("Manager Name: " + manager.name);
        System.out.println("Manager Age: " + manager.age);
        System.out.println("Manager Salary: " + manager.salary);
        System.out.println("Manager Address: " + manager.address);
        System.out.println("Manager Work Bonus: " + manager.workBonus);
        System.out.println("Manager Holidays: " + manager.holidays);

        FullTime fullTimeEmployee = new FullTime("Alice", 28, 4000.0, "456 Oak St", 500.0);
        System.out.println("\nFull-Time Employee Name: " + fullTimeEmployee.name);
        System.out.println("Full-Time Employee Age: " + fullTimeEmployee.age);
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.salary);
        System.out.println("Full-Time Employee Address: " + fullTimeEmployee.address);
        System.out.println("Full-Time Employee Overtime Bonus: " + fullTimeEmployee.overtimeBonus);

        PartTime partTimeEmployee = new PartTime("Bob", 22, 2000.0, "789 Pine St", "2024-06-30");
        System.out.println("\nPart-Time Employee Name: " + partTimeEmployee.name);
        System.out.println("Part-Time Employee Age: " + partTimeEmployee.age);
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.salary);
        System.out.println("Part-Time Employee Address: " + partTimeEmployee.address);
        System.out.println("Part-Time Employee End Date: " + partTimeEmployee.endDate);
    }
}

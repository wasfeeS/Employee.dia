import java.util.Scanner;

class FullTime extends Employee {
    private double overtimeBonus;

    public FullTime(String name, int age, double salary, String address, double overtimeBonus) {
        super(name, age, salary, address);
        this.overtimeBonus = overtimeBonus;
    }

    public double getOvertimeBonus() {
        return overtimeBonus;
    }

    public void setOvertimeBonus(double overtimeBonus) {
        this.overtimeBonus = overtimeBonus;
    }
}
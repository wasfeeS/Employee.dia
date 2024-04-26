import java.util.Scanner;

class Manager extends Employee {
    private int workBonus;
    private String holidays;

    public Manager(String name, int age, double salary, String address, int workBonus, String holidays) {
        super(name, age, salary, address);
        this.workBonus = workBonus;
        this.holidays = holidays;
    }

    public int getWorkBonus() {
        return workBonus;
    }

    public void setWorkBonus(int workBonus) {
        this.workBonus = workBonus;
    }

    public String getHolidays() {
        return holidays;
    }

    public void setHolidays(String holidays) {
        this.holidays = holidays;
    }
}

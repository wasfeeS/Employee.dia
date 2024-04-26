import java.util.Scanner;

class PartTime extends Employee {
    private String endDate;

    public PartTime(String name, int age, double salary, String address, String endDate) {
        super(name, age, salary, address);
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}

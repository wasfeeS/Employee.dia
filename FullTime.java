class FullTime extends Employee {
    private double overtimeBonus;

    public FullTime(String name, int age, double salary, String address, double overtimeBonus) {
        super(name, age, salary, address);
        this.overtimeBonus = overtimeBonus;
    }
}

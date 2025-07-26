public class Developer extends Employee{
    //Attributes
    private int overTime;
    private double overtimeValue;
    //Builder
    public Developer(String name, double baseSalary, int overTime, double overtimeValue){
        super(name, baseSalary);
        this.overTime = overTime;
        this.overtimeValue = overtimeValue;
    }

    //Get
    public int getOverTime() {
        return overTime;
    }
    public double getOvertimeValue() {
        return overtimeValue;
    }

    //Set
    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }
    public void setOvertimeValue(double overtimeValue) {
        this.overtimeValue = overtimeValue;
    }
    //

    @Override
    public double calculateSalary() {
        return this.baseSalary + (this.overTime * this.overtimeValue);
    }
}

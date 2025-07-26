public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }
    //Get
    public double getBonus() {
        return bonus;
    }
    //Set
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return this.baseSalary + this.bonus;
    }
}

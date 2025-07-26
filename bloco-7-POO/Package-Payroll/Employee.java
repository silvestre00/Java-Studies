public class Employee {
    //Attributes
    private String name;
    private final int id;
    protected double baseSalary;

    private static int nextAvailableID = 1;
    //Builder
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = nextAvailableID;
        Employee.nextAvailableID++;
        System.out.printf(">>Employee: '%s' registered with ID %d.%n", this.name, this.id);
    }

    //Get
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    //Set
    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    //Methods
    public double calculateSalary(){
        return baseSalary;
    }
}

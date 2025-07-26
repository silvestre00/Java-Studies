public class Payroll {
    public static void main(String[] args){
        //Array
        Employee[] employees = new Employee[3];
        //We populate the array with objects of different types.
        employees[0] = new Manager("Silvestre", 5000, 1500.0);
        employees[1] = new Developer("Ana", 3500, 10, 30.0);
        employees[2] = new Developer("Carlos", 3500, 5, 30.0);
        //
        double totalPayroll = 0;

        System.out.println("---Calculating Payroll---");

        // A single Loop for all Employees
        for (Employee func : employees){
            double monthlySalary = func.calculateSalary();
            totalPayroll += monthlySalary;
            //Separate return for each employee.
            System.out.printf("Calculating salary for %s (ID: %d): R$%.2f%n",
                    func.getName(), func.getId(), monthlySalary);
        }

        System.out.println("------------------------------------");
        System.out.printf("Total Payroll Amount: R$%.2f%n", totalPayroll);
    }
}

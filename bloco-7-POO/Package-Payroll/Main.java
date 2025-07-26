ublic class Main {
    public static void main(String[] args) {
        System.out.println("Hiring employees...");

        Manager manager1 = new Manager("Silvestre", 5000, 1500);
        Developer dev1 = new Developer("Ana", 3500, 10, 30);
        Developer dev2 = new Developer("Carlos", 3500, 5, 30);

        System.out.println("\n--- Company Report ---");
        System.out.printf("Employee: %s, ID: %d%n", manager1.getName(), manager1.getId());
        System.out.printf("Employee: %s, ID: %d%n", dev1.getName(), dev1.getId());
        System.out.printf("Employee: %s, ID: %d%n", dev2.getName(), dev2.getId());

    }
}

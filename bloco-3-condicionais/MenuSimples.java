public class MenuSimples{
    public static void main(String[] args){
        int option = 3;

        switch(option) {
            case 1:
                System.out.println("Register user");
                break;
            case 2:
                System.out.println("List users");
                break;
            case 3:
                System.out.println("Leave");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

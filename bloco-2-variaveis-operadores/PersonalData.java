public class PersonalData{
    public static void main(String[] args){
        String name = "Silvestre";
        int age = 21;
        double height = 1.86;
        boolean student = true;
        double note1 = 6.5;
        double note2 = 7;
        double average = (note1 + note2) / 2;

        System.out.println("My name is: " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("I'm " + height + "m tall" );
        System.out.println("I am a student? " + student);
        System.out.println("My first note was: " + note1);
        System.out.println("My second note was: " + note2);
        System.out.println("My grade average is: " + average);
    }
}

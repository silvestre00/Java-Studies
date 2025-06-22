public class StudentClassification{
    public static void main(String[] args) {
        int note = 60;

        if (note >= 100) {
            System.out.println("Perfect!");
        } else if (note >= 90) {
            System.out.println("Very good!");
        } else if (note >= 70) {
            System.out.println("Good");
        } else if (note >= 60) {
            System.out.println("Approved");
        } else {
            System.out.println("Failed. Study more");
        }
    }
}

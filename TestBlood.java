import java.util.Scanner;

public class TestBlood {
    public static void main(String[] args) {
        // creating scanner object to read user input

        Scanner scanner = new Scanner(System.in);



        // using default values for the first patient

        Patient defaultpatient = new Patient("988",17, "A", "+" );

        // prompt user for values for second object
        System.out.println("Enter your ID: ");
        String secondID = scanner.nextLine();
        System.out.println("Enter your age:");
        int secondage = scanner.nextInt();
        System.out.println("Enter your blood type");
        String secondbloodtype = scanner.nextLine();
        System.out.println("Enter your rH factor");
        String secondrh = scanner.nextLine();
        Patient custompatient = new Patient(secondID, secondage, secondbloodtype, secondrh);
        

    // prompting the user for patient data but using default values for thiss one

        System.out.println("Enter your ID please:");
        String thirdID = scanner.nextLine();
        System.out.println("Enter your age please");
        int thirdage  = scanner.nextInt();
        scanner.nextLine();
        Patient thirdpatient = new Patient(thirdID, thirdage, "O","+");

    // display the information for all three patients
        System.out.println("Patient 1:" + defaultpatient);
        System.out.println("Patient 2:" + custompatient);
        System.out.println("Patient 3:" + thirdpatient);

    }



}
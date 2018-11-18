import java.util.List;
import java.util.Scanner;

public class Boundary {

    public static void main(String[] args) {
        System.out.println("Do you want to initialize the database? (Y/N)");
        Scanner scan= new Scanner(System.in);
        if(scan.nextLine().equals("Y")){
            DatabaseManager.resetDatabase();
            DatabaseManager.initializeDatabase();
        }
        while(true){
            System.out.println("Select an option:");
            System.out.println("1. Create a new course");
            System.out.println("2. Register a new student");
            System.out.println("3. Enroll an existing student in an existing course");
            System.out.println("4. Get students");
            System.out.println("5. Exit");
            int choice = new Integer(scan.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Insert course title:");
                    break;
                case 2:
                    System.out.println("Insert student ID:");
                    break;
                case 3:
                    System.out.println("Insert course title:");
                    String courseTitle = scan.nextLine();
                    System.out.println("Insert student ID:");
                    String studentID = scan.nextLine();
                    break;
                case 4:
                    System.out.println("Insert course title:");
                    String course = scan.nextLine();
                    break;
                default:
                    choice = 5;
                    break;
            }
            if(choice == 5)
                break;
        }
        scan.close();
    }
}
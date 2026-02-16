import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the School Managemnt System");
        int option;
        System.out.println("What do you want to do"+"\n"+
            "1.Enroll \n"
            +"2.GetInfo\n"+
            "3.delete records"
        
        );
         System.out.println("Enter your choice");
        option=sc.nextInt();
       
        switch (option) {
            case 1:
                System.out.println("Enter type of person");
                String personType=sc.next();
                enroll(personType);
                break;
            case 2:
            case 3:
            default:
                throw new AssertionError();
        }
    }
    public static void enroll (String personType) throws Exception{
        Scanner s=new Scanner(System.in);
        if(personType.equalsIgnoreCase("student")){
            File file=new File("D:\\Java\\Student Management System\\Student Management System\\src\\Student.txt");
            PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
            String name;
            int age;    
            String address;
            String studentId;
            String classLevel;
            double latestGPA;
            System.out.print("Enter the name of studnet: ");
            name=s.nextLine();
            System.out.print("Enter the age of studnet: ");
            age=s.nextInt();
            s.nextLine();
            System.out.print("Enter the address of studnet: ");
            address=s.nextLine();
            System.out.print("Enter the studentId of studnet: ");
            studentId=s.nextLine();
            System.out.print("Enyter the classlevel");
            classLevel=s.nextLine();
            System.out.print("enter the latestGPA: ");
            latestGPA=s.nextDouble();
            Student student=new Student(name, age, studentId, classLevel, address, latestGPA);
            pw.print(student.toString());
            pw.close();
        }

    }
}

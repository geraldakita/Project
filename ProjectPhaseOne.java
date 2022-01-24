import java.util.ArrayList;
import java.util.Scanner;

public class ProjectPhaseOne {

    ArrayList<String> emailArray = new ArrayList<String>();
    ArrayList<String> passwordArray = new ArrayList<String>();

    public ProjectPhaseOne(){
        int counter;
        System.out.println("How many accounts do you want to create?");
        Scanner count = new Scanner(System.in);
        counter = count.nextInt();

        int i = 0;
        do{
            createAccount();
            i++;
        } while(i != counter);
    }

    public void createAccount() {
        String email, password;
        
        System.out.println("Enter your email address");
        Scanner em = new Scanner(System.in);
        email = em.nextLine();
        System.out.println("Enter your password");
        Scanner pwd = new Scanner(System.in);
        password = pwd.nextLine();

        emailArray.add(email);
        passwordArray.add(password);

        System.out.println("\nYour details have been stored successfully!");
        System.out.println("-------------------------------------------\n");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password + "\n");

    }

    

    public static void main(String[] args) {
        ProjectPhaseOne user1 = new ProjectPhaseOne();
        System.out.println(user1.emailArray);
        
    }
}
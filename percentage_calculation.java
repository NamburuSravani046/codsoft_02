import java.util.Scanner;
public class percentage_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter your marks of s1");
        int s1 = sc.nextInt();
        System.out.println("Enter your marks of s2");
        int s2 = sc.nextInt();
        System.out.println("Enter your marks of s3");
        int s3 = sc.nextInt();
        System.out.println("Enter your marks of s4");
        int s4 = sc.nextInt();
        System.out.println("Enter your marks of s5");
        int s5 = sc.nextInt();
        int total_Marks = s1+s2+s3+s4+s5;
        float percentage = (total_Marks *100/500);
        System.out.println("your percentage " + percentage);
        System.out.println("your marks " + total_Marks);
        while (true) { 
            

if (total_Marks >= 450) {
    System.out.println("Grade is A");
    break;
} else if (total_Marks >= 400 && total_Marks <= 449) {
    System.out.println("Grade is B");
    break;
} else if (total_Marks >= 350 && total_Marks <= 399) {
    System.out.println("Grade is C");
    break;
} else {
    System.out.println("Grade is D");
    break;
}
            

            
        
        }
        



        


    }
    
}
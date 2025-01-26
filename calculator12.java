import java.util.Scanner;
public class calculator12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter total number of subjects to calculate
        System.out.println("enter the total number of subject:"); 
        int numSubjects = sc.nextInt();

        int totalmarks = 0;
        for(int i=1; i<=numSubjects; i++) {
            System.out.println("enter marks for subjects"+ i + "(out of 100):");
            int marks = sc.nextInt();
        
        while (marks <0 || marks > 100) {
            System.out.println("invalid marks please enter marks between 0 & 100. ");
            System.out.println("enter marks for subject"+ i +"out of 100");
            marks = sc.nextInt();
            
        }
        totalmarks += marks;
    }

     System.out.println("Student result:");
    System.out.println("total marks obtained in all subject:" + totalmarks);
        // average percentage
        int Averagepercentage = totalmarks/numSubjects;
        System.out.println("average percentage:"+ Averagepercentage);
        // grade
        if(Averagepercentage >= 90) {
            System.out.println("your grade: A+");
        }
        else if(Averagepercentage >=80){
            System.out.println("your grade is : B");
        }
        else if(Averagepercentage >=70){
            System.out.println("your grade is : C+");
        }
        else if(Averagepercentage >=60){
            System.out.println("your grade is : C");
        }
        else if(Averagepercentage >=50){
            System.out.println("your grade is : B+");
        }
        else if(Averagepercentage >=40){
            System.out.println("your grade is : D+");
        }
        else if(Averagepercentage >=30){
            System.out.println("your grade is : D");
        }
        else  {
            System.out.println("your grade is: E");
        }

        sc.close();
    }


}
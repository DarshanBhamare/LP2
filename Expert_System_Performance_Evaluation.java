import java.util.*;
public class Expert_System_Performance_Evaluation { 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee Performance Evaluation System");
        System.out.print("Enter Employee Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Overtime Hours: ");
        int overtimeHours=sc.nextInt();
        System.out.print("Enter Number of Projects Completed: ");
        int projectsCompleted=sc.nextInt();
        System.out.print("Enter Customer Feedback Score (0-10): ");
        int feedbackScore=sc.nextInt();
        System.out.print("Enter Attendance Percentage: ");
        double attendancePercentage=sc.nextDouble();
        int score=(overtimeHours*2)+(projectsCompleted*2)+(feedbackScore*2)+(int)(attendancePercentage);
        if(score>=90){
            System.out.println("Employee: "+name+" Performance: Excellent");
        }
        else if(score>=80){
            System.out.println("Employee: "+name+" Performance: Good");
        }
        else if(score>=70){
            System.out.println("Employee: "+name+" Performance: Average");
        }
        else if(score>=60){
            System.out.println("Employee: "+name+" Performance: Below Average");
        }
        else{
            System.out.println("Employee: "+name+" Performance: Poor");
        }
    }
}
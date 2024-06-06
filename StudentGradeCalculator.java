import java.util.Scanner;



public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter Number Of Subject's");
        int NumberOfSubject=sc.nextInt();
        int totalMarks=0;
        for (int i=1;i<NumberOfSubject;i++){
            System.out.println("Enter marks obtained in " + i + " : ");
            int marks =sc.nextInt();
            totalMarks+=marks;
        }
        double averP=(double)totalMarks/NumberOfSubject;
        char Grade;
        if(averP>=90){
            Grade='0';
        } else if (averP>=80) {
            Grade='A';
        } else if (averP>=65) {
            Grade='B';
        }else if (averP>=50) {
            Grade = 'C';
        } else if (averP>=33) {
            Grade='D';
        }else {
            Grade='F';
        }
        System.out.println("Total marks scored is "+totalMarks);
        System.out.println("Average percentage gained is "+averP+"%");
        System.out.println("Grade : "+Grade);
    }
}


// Student grade calculator 

import java.util.Scanner;

class Task_2_codsoft {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // we assume there are ten subjects therefore the size of the arrages is as follows :-
        System.out.println("enter the marks obtained out of hundred ");
        String sub[] = {"English" , "Hindi" , "Maths" , "Physics" , "Chemistry" , "Computer Science"};
        double marks[] = new double[6];
        for (int i = 0; i < sub.length; i++) {
            marks[i] = sc.nextDouble();
            while (marks[i]>100 || marks[i]<0){
            System.out.println("error! re-enter the marks ");
            marks[i] = sc.nextDouble();
            }
        }
        double total_marks = 0.0 , avgp ; 
        for (int j = 0 ; j < 6; j++){
            total_marks = total_marks + marks[j];
        }
        avgp = (total_marks / 6);
         
       if (avgp >= 90)
       System.out.println("Total marks =" + total_marks+"/600"+"\nAverage Percent = "+avgp+"%"+"\nGrade A");
       else if (avgp >=80 && avgp <90)
       System.out.println("Total marks =" + total_marks+"/600"+"\nAverage Percent = "+avgp+"%"+"\nGrade B");
       else if (avgp >= 70 && avgp <80)
       System.out.println("Total marks =" + total_marks+"/600"+"\nAverage Percent = "+avgp+"%"+"\nGrade C");
       else if (avgp >= 60 && avgp <70)
       System.out.println("Total marks =" + total_marks+"/600"+"\nAverage Percent = "+avgp+"%"+"\nGrade D");
       else if (avgp>= 40 && avgp<60)
       System.out.println("Total marks =" + total_marks+"/600"+"\nAverage Percent = "+avgp+"%"+"\nGrade E");
       else 
       System.out.println("Total marks =" + total_marks+"/600"+"\nAverage Percent = "+avgp+"%"+"\nGrade F");
       sc.close();
    }
}
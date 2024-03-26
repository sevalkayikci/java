//Java Program to demonstrate the use of If else-if ladder.  
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  

public class marks {

    public static void main(String[] args) {
        int grade = 55;

        if (grade > 90) {

            System.out.println("you got A+");
            
        }
        else if (grade > 80 && grade < 90) 
        {
            System.out.println("you got A");
            
        }
        else if (grade > 70 && grade < 80) 
        {
            System.out.println("you got B");
        }
        else if (grade > 60 && grade < 70) 
        {
            System.out.println("you got C");
            
        }
        else{
            System.out.println("you got D");
        }
      
    }
    
}
//grade > 50 && grade < 60) {
//System.out.println("you got D"//
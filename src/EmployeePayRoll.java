import java.util.Random;

public class EmployeePayRoll {

    public static void main(String[] args) {

        int IS_PRESENT = 1;
        int RATE_PER_HOUR = 20;
        int TOTAL_HOUR = 8;
        
        double checker =  Math.floor(Math.random() * 10)%2;

        int employeeDailyWage = RATE_PER_HOUR * TOTAL_HOUR;

        if(checker == IS_PRESENT){
            System.out.println("Employee is present ");
            System.out.println("Employee Daily Wage is : "+ employeeDailyWage);
        }else{
            System.out.println("Employee is Absent ");
            System.out.println("Employee Daily Wage is : "+ 0);
        }
    }
}



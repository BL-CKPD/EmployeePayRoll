import java.util.Random;

public class EmployeePayRoll {

    public static void main(String[] args) {

        int IS_PRESENT = 1;
        double checker =  Math.floor(Math.random() * 10)%2;

        if(checker == IS_PRESENT){
            System.out.println("Employee is present "+ checker);
        }else{
            System.out.println("Employee is Absent "+ checker);
        }
    }
}



//Annual salary calculator for an employee in Java


public class Main {



    //Function to calculate an employee
    public static double salaryCalculator(double hourPerweek, double amountPerHour, int vacationDays){

        if (hourPerweek < 0){
            return -1;
        }

        if (amountPerHour < 0){
            return -1;
        }

        //Calculting weekly paycheck
        double weeklypaycheck = hourPerweek * amountPerHour;
        
        //Calculating Vacation/Leave time
        double unpaidTime = vacationDays * amountPerHour * 8;

        //returning yearly paycheck of an employee
        return (weeklypaycheck * 52) - unpaidTime;


    }

    public static void main(String[] args){

        double salary = salaryCalculator(40, 50, 8);
        System.out.println("Annual Salary of an employee is:" + " "+ salary);



    }
    
}



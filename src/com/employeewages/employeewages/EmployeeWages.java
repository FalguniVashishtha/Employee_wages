package com.employeewages.employeewages;
import java.util.Random;
public class EmployeeWages {
    public static void main(String args[]) {

        System.out.println("Welcome to Employeewage page");

        int IS_FUll_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        Random random = new Random();
        int empCheck = random.nextInt();

        if(empCheck == IS_FUll_TIME) {
            System.out.println("Employee is Present.");
            empHours = 8;
        }
        else if(empCheck == 2)
        {
            System.out.println("Employee worked for half day.");
            empHours = 4;
        }
        else {
            System.out.println("Employee is Absent.");
        }
        empWage = empHours*EMP_RATE_PER_HOUR;
        System.out.println("The daily wage is " + empWage);
    }

}

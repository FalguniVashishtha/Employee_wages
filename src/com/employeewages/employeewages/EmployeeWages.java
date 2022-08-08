package com.employeewages.employeewages;
import java.util.Random;
public class EmployeeWages {
    final static int FULL_TIME_WORKER = 1;
    final static int PART_TIME_WORKER = 2;
    final static int Total_Working_Day = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employeewage Page");
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;

        Random random = new Random();
        int empCheck = random.nextInt(2);


        switch (empCheck) {
            case FULL_TIME_WORKER:
                empHours = 8;
                System.out.println("Employee is present");
                break;
            case PART_TIME_WORKER:
                empHours = 4;
                System.out.println("Employee is present");
                break;
            default:

                System.out.println("Employee is absent");
        }

        empWage = empHours * EMP_RATE_PER_HOUR;
        int Total_emp_wage = empWage * Total_Working_Day;
        System.out.println("The daily wage of Employee is" + empWage);
        System.out.println("The Monthly Wage of Employee is" + Total_emp_wage);
    }
}

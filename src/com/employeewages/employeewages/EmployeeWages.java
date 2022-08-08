package com.employeewages.employeewages;
import java.util.Random;
public class EmployeeWages {
    private  String company;
    static int EMP_RATE_PER_HOUR;
    static  int workingDaysPerMonth;
    static  int maxWorkingHours;
    private int totalEmpWage;



    //Constructor for the class
    public EmployeeWages(String company, int EMP_RATE_PER_HOUR, int workingDaysPerMonth, int maxWorkingHours)
    {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingHours = maxWorkingHours;
    }
    public void companyWage(){
        System.out.printf("Employee Wage details: ", company).println();

        int empWage = 0, totalWage=0, workingHours = 0, empHours = 0;
        Random random = new Random();

        //Calculating the total wage per month
        for (int day = 1; day<=workingDaysPerMonth && workingHours<maxWorkingHours; day++) {
            //Max Working hours should be 100.
            int empCheck = random.nextInt(3);
            switch (empCheck)
            {
                case 1:
                    System.out.printf("Day %d: Employee is Present for full day.", day).println();
                    empHours = 8;
                    break;
                case 2:
                    System.out.printf("Day %d: Employee worked for half day.", day).println();
                    empHours = 4;
                    break;
                default:
                    System.out.printf("Day %d: Employee is Absent.", day).println();
                    empHours = 0;
                    break;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.printf("Worked: "+ empHours + "hours, Wage:$" +empWage).println("\n");
            totalWage += empWage;
            workingHours += empHours; //Max Working Hours is 100, loop terminates if it is above 100.
        }
        totalEmpWage = workingHours*EMP_RATE_PER_HOUR;
        System.out.printf("The Total wage of "+company+ "for this month: $ " + totalWage).println();
        System.out.printf("Total hours of working for "+company+": " + workingHours ).println();
        System.out.println();
    }
    //overriding the toString() method
    public String toString(){
        return "Total wage  for the Company " + company + " is: " + totalEmpWage;
    }
    //main method.
    public static void main(String args[]) {
        //Welcome message
        System.out.println("Welcome to Employee Wage Builder. \n");
        EmployeeWages company1 = new EmployeeWages("Bridgelabz", 20, 20, 100);
        company1.companyWage();
        EmployeeWages company2 = new EmployeeWages("TCS", 15, 30, 200);
        company2.companyWage();
        System.out.println(company1);
        System.out.println(company2);
    }
}

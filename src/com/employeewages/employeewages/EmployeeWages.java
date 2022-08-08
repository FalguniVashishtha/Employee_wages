package com.employeewages.employeewages;
import java.util.Random;
public class EmployeeWages {
    final static int FULL_TIME_WORKER = 1;
    final static int PART_TIME_WORKER = 2;

    public static void computeEmpWage(String company, int EMP_RATE_PER_HOUR, int Total_no_Working_Day, int EMP_TOTAL_HOURS) {
        int totalworkingdays = 0;
        int empHours = 0;
        int empWage = 0;
        int Totalemphrs = 0;
        System.out.println("Welcome to Employee Wage Page");

        while (Totalemphrs <= EMP_TOTAL_HOURS && totalworkingdays <= Total_no_Working_Day) {
            totalworkingdays++;
            Random random = new Random();

<<<<<<< HEAD
    //Constructor for the class
    public EmployeeWages(String company, int EMP_RATE_PER_HOUR, int workingDaysPerMonth, int maxWorkingHours){
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingHours = maxWorkingHours;
    }
    //Computation of company wage
    public void companyWage(){
        System.out.printf("%s Employee Wage details: ", company).println();
        //local variables
        int empWage = 0, totalWage=0, workingHours = 0, empHours = 0;
        Random random = new Random();
        //Calculating the total wage per month
        for (int day = 1; day<=workingDaysPerMonth && workingHours<maxWorkingHours; day++) {
            //Max Working hours should be 100.
            int empCheck = random.nextInt();
            switch (empCheck) {
                case 1:
                    System.out.printf("Day %d: Employee is Present for full day.", day).println();
=======
            int empCheck = random.nextInt();

            switch (empCheck) {
                case FULL_TIME_WORKER:
>>>>>>> UC8
                    empHours = 8;
                    System.out.println("Employee is present");
                    break;
                case PART_TIME_WORKER:
                    empHours = 4;
                    System.out.println("Employee is present");
                    break;
                default:
                    empHours = 0;
                    System.out.println("Employee is absent");
            }
            Totalemphrs = Totalemphrs + empHours;
            empWage = empHours * EMP_RATE_PER_HOUR;
<<<<<<< HEAD
<<<<<<< HEAD
            System.out.printf("Worked: " +empHours+ "hours, Wage:$" +empWage).println("\n");
=======
            System.out.printf("Worked:"+empHours+"hours, Wage:$" +empWage).println("\n");
>>>>>>> UC10
            totalWage += empWage;
            workingHours += empHours; //Max Working Hours is 100, loop terminates if it is above 100.
=======
            int Total_emp_wage = empWage + Totalemphrs;
            Total_emp_wage = Total_emp_wage * Total_no_Working_Day;
            System.out.println("The daily wage of Employee of " + company + " is" + empWage);
            System.out.println("The Monthly Wage of Employee of " + company + " is" + Total_emp_wage);

>>>>>>> UC8
        }
<<<<<<< HEAD
=======
        totalEmpWage = workingHours*EMP_RATE_PER_HOUR;
        System.out.printf("The Total wage of " +company+ "for this month: $ " + totalWage).println();
        System.out.printf("Total hours of working for " +company+ ": " + workingHours ).println();
        System.out.println();
>>>>>>> UC10
    }
<<<<<<< HEAD
    //overriding the toString() method
    public String toString(){
        return "Total wage  for the Company " + company + " is: " + totalEmpWage;
    }
    // main method.
    public static void main(String args[])
    {
        //Welcome message
        System.out.println("Welcome to Employee Wage \n");

        EmployeeWages company1 = new EmployeeWages("HCL", 20, 30, 150);
        company1.companyWage();
        EmployeeWages company2 = new EmployeeWages("TCS", 15, 15, 200);
        company2.companyWage();
        System.out.println(company1);
        System.out.println(company2);
=======

    public static void main(String[] args) {
        computeEmpWage("Bridgelabz", 20, 20, 200);
        computeEmpWage("HCL", 45, 30, 300);


>>>>>>> UC8
    }
}

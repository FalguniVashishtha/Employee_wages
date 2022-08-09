package com.employeewages.employeewages;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
//implementing interface
interface IEmpWageBuilder
{
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);
    public void companyWage();
}

class EmpWageBuilder implements IEmpWageBuilder
{
    int noOfCompanies, index;
    ArrayList<CompanyEmpWage> companies; //ArrayList declaration
    HashMap<String, Integer> fullMonthWage; //HashMap Declaration, String = Company name, Integer = Full month wage.
    public EmpWageBuilder()
    {
        companies = new ArrayList<>(); //Creating Array list
        fullMonthWage = new HashMap<>(); //Creating Hash Map
    }
    //Assigning array
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
        companies.add(company);
        fullMonthWage.put(companyName,0);
    }
    int companyWage(CompanyEmpWage companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee:");
        System.out.printf("%1s   %5s   %5s   %5s\n", "Day", "Work_hrs", "Total_Wage", "Total_working_hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType(); //random value(0,1)
            workingHrs = getWorkingHrs(empType); //Full time, Part time or Absent
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%2d   %5d   %9d   %12d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        fullMonthWage.put(companyEmpWage.COMPANY_NAME, totalWage); // insert an entry in the map. key, value)
        return totalWage;
    }
    int generateEmployeeType() {
        Random random = new Random();
        return random.nextInt();
    }
    int getWorkingHrs(int empType) {
        switch (empType) {
            case 1:
                return 8;
            case 2:
                return 4;
            default:
                return 0;
        }
    }
    public void companyWage() {
        for (CompanyEmpWage company : companies) //for-each loop
        {
            int totalWage = companyWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company); //overriding the toString() method
        }
    }
    void printTotalEmpWages(){
        System.out.println("The Companies and the full Month wage details of the Employee:");
        for (String companyName : fullMonthWage.keySet()) //It is used to return a set view of the keys contained in this map.
        {
            System.out.println(companyName + ": " + fullMonthWage.get(companyName)); //Get method to get the value of key value.
        }
    }

    public static void main(String args[])
    {
        System.out.println("Welcome to Employee Wage Builder. \n");
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.addCompany("Bridgeabz", 20, 20, 100);
        emp.addCompany("TCS", 25, 25, 2200);
        emp.companyWage(); // Daily Wage along with the Total Wage
        emp.printTotalEmpWages(); // Total Wage of the month of all companies.
    }
}
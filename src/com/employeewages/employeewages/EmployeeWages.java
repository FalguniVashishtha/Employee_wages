package com.employeewages.employeewages;
import java.util.Random;
public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome to employee page");
        int IS_fULL_tIME = 1;
        Random random = new Random();
        int empCheck = random.nextInt();
        if (empCheck == IS_fULL_tIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");

        }
    }

}

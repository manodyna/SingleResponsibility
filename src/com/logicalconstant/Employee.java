package com.logicalconstant;

//This class is a violation of the single responsibility principle.
//The number of responsibilities in this class is two
public class Employee {
    public static double calculatePay(String employeeId){
        double pay=0;
//        complex logic to calculate the pay
        return pay;
    }

    public static void createEmployee(String employeeId, String employeeName){
//     complex logic to save a new employee to database
    }
}

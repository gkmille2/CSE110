// ------------------------------------------------------------
// STUDENT NAME: Garren Miller
// FILENAME: Employee.java
// DESCRIPTION: Declare Employee class
// FOR: CSE 110 - Homework Assignment #6
// TIME SPENT: 2 hrs
// DATE: 3/27/2019
//-------------------------------------------------------------

/*
* Questions:
*
* 1. The problem is that the program tries to call a method attached to a non-existent object, which is impossible.
*    The compiler first prints out the string "null" and then an error message on the next line.
*
* 2. Allowing the instance data to be public would have some bad consequences.  Users of the instances in the program
*    would be able to change data without using methods.  This would be a breach of security in some cases, i.e. when a
*    variable needs to be read-only.
* */

public class Employee {
    private String name = new String();
    private double salary;
    private int yearsOfExperience;
    private int numOfEmployees = 0;

    public Employee() {
        name = "None";
        salary = 0.0;
        yearsOfExperience = 0;
    }

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;

    }

    public Employee(String str) {
        int ch = ',';
        int length = str.length();
        int index1 = str.indexOf(ch);
        int index2 = str.indexOf(ch, index1+1);

        this.name = str.substring(0,index1);
        this.salary = Double.parseDouble(str.substring(index1 + 1, index2));
        this.yearsOfExperience = Integer.parseInt(str.substring(index2 + 1, length));
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setYears(int numYears) {
        this.yearsOfExperience = numYears;
    }

    public int getYears() {
        return yearsOfExperience;
    }

    public void raiseSalary(double byPercent) {
        this.salary = salary * (1 + (byPercent)/100);
    }

    public static int countEmployees() {
        return 2;
    }

    public Employee moreExperience(Employee employeeObj) {
        if(this.yearsOfExperience > employeeObj.yearsOfExperience) {
            return this;
        }
        else if(this.yearsOfExperience < employeeObj.yearsOfExperience) {
            return employeeObj;
        }
        else {
            return null;
        }
    }

    public String toString() {
        String info = String.format("\nName: %s \nSalary: $%,.2f \nYears of Experience: %d", this.name, this.salary, this.yearsOfExperience);
        return info;
    }
}

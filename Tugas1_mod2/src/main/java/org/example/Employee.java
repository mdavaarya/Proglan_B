package org.example;

public class Employee { //1. PINDAH CLASS LALU KITA BIKIN SETTER SAJA
    private String name;
    private int id;
    private double salary;
    private String department;
    public static final double BONUS_RATE= 0.1;
    public Employee (String name, int id, double salary, String department) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
        this.setDepartment(department);
    }
    public void printDetails() {
        System.out.println("Employee 10: " + id);
                System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
                System.out.println("Department: " + department);
    }
    public void applyBonus() {
        //2.PERHITUNGAN BONUS PADA METHOD TERPISAH
        setSalary(salary + getBonus()); //3. hasil inline variable bonus
        System.out.println("Bonus applied! New salary: " + salary);
    }

    private double getBonus() { //2. HASIL METHOD
        double bonus = salary + BONUS_RATE;
        return bonus;
    }

    public void updateDepartment(String newDepartment) {
        setDepartment(newDepartment);
        System.out.println("Department updated to: " + department);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

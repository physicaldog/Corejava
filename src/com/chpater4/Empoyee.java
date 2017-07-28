package com.chpater4;

import java.time.LocalDate;

public class Empoyee extends Person implements Comparable<Empoyee>,Minterface,Name{
    static int nextid;
    private int id;
    private String name = "";
    private double salary;
    private LocalDate hireday;
    
    static
    {
        nextid = 0;
    }
    
    public Empoyee() {
//        this.nextid = 0;
        this.id = getId();
        this.name = "";
    }
    
    public Empoyee(String name, double salary, int year, int month, int day) {
        this();
        this.name = name;
        this.salary = salary;
        this.hireday = LocalDate.of(year, month, day);
    }
    
    public String getDescrition() {
        return "I'm a Empoyee!";
    }
    
    public void voi() {
        Name.super.voi();
    }
    
    private int getId() {
        int id = this.nextid;
        this.nextid++;
        return id;
    }
    
    public void setId() {
        this.id = this.nextid;
        this.nextid++;
    }
    
    static int getNextId() {
        return nextid;
    }
    
    String getName() {
        return this.name;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void raiseSalary(double byPercent) {
//        this.salary = this.salary*(1+byPercent/100);
        double raise = this.salary*byPercent/100;
        this.salary += raise;
    }
    
    public LocalDate getHireday() {
        return this.hireday;
    }
    
    public boolean equals(Empoyee other) {
        System.out.println("em"+other.name);
        return this.name.equals(other.name);
    }
    
    public int compareTo(Empoyee other) {
        return Double.compare(this.salary, other.salary);
    }

    public static void main(String[] args) {
        Empoyee xEmpoyee = new Empoyee();
        Person xPerson = xEmpoyee;
        Minterface xMinterface = xEmpoyee;
        Name xName = xEmpoyee;
        
        System.out.println(xEmpoyee.getDescrition());
        System.out.println(xPerson.getDescrition());
        System.out.println(xMinterface.getDescrition());
        xEmpoyee.voi();
        
    }
}

class Boss extends Manager {
     private String name = "boss";
     public String getName() {
        return name;
    }
     public static void main(String[] args) {
         Empoyee empoyee = new Empoyee("monkey", 10000, 2016, 5, 10);
//         System.out.println(empoyee.getName()+" "+empoyee.getSalary()+" "+empoyee.getHireday());
     
     }
}
package com.chpater4;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Manager extends Empoyee implements ActionListener {
    private double bonus;
    
    public Manager() {
    }
    
    public Manager(String name,double salary,int year,int month,int day) {
        super(name, salary, year, month, day);
    }
   
    static int getNextId(){
        return 9;
    }
    
    String getName() {
        return "Monkey";
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() {
        return this.bonus + super.getSalary();
    }
    
    public void actionPerformed(ActionEvent event) {
        System.out.println("monkey");
        Toolkit.getDefaultToolkit().beep();
    }
    
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>");
        ActionListener listener = new Manager();
        Timer xTimer = new Timer(1000, listener);
        xTimer.start();
        JOptionPane.showMessageDialog(null, "quit?");
        System.exit(0);
        
        Manager xmManager = (Manager)listener;
    }
    
    class Mprint{
        
    }
    
}

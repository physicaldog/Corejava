package com.chpater4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class EmpoyeeTest {

    public static void main(String[] args) {
        Empoyee[] staff = new Empoyee[3];
        
        staff[0] = new Empoyee("mack", 1000, 2016, 5, 2);
        staff[1] = new Empoyee("jack", 4000, 2016, 5, 2);
        staff[2] = new Empoyee("nack", 3000, 2016, 5, 2);
        
        Manager xmManager = new Manager();
        System.out.println(xmManager instanceof Comparable);
        
        Arrays.sort(staff);
        
        for (Empoyee empoyee : staff) {
            System.out.println(empoyee.getName());
        }
    }
}
    
    
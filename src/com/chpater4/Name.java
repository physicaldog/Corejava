package com.chpater4;

public interface Name {
    String getDescrition();
    default void voi(){
        System.out.println("MONKEY");
    }
}

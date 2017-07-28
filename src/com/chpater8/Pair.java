package com.chpater8;

public class Pair<T> {
    private T first;
    private T second;
    
    public Pair() {
        // TODO 自动生成的构造函数存根
        first = null;
        second = null;
    }
    
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return this.first;
    }
    
    public T getSecond() {
        return this.second;
    }
    
    public void setFirst(T newValue) {
        this.first = newValue;
    }
    
    public void setSecond(T newValue) {
        this.second = newValue;
    }
    
    public static void main(String[] args) {
        Pair<String> xPair = new Pair<String>("mick", "jack");
        
        System.out.println(xPair.getFirst()+" "+xPair.getSecond());
        
     
    }
}

package com.gabi.lab97;

public class ClassA {
    private int a;

    public ClassA(int a){
        this.a = a;
    }

    public void verificaNegative(int a) throws Exceptie1 {
        if(a < 0)
            throw new Exceptie1("Temperatura la nivelul tarii este negativa");
        else
            System.out.println("Temperatura la nivelul tarii in parametrii normali");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}

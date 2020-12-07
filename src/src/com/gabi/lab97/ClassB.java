package com.gabi.lab97;

public class ClassB extends ClassA {

    private int b;

    public ClassB(int a, int b) {
        super(a);
        this.b = b;
    }

    public void verificaNegative(int a, int b) throws Exceptie1 {
        super.verificaNegative(a);
        if(b < 0)
            throw new Exceptie2("Temperatura la nivelul judetului Sibiu este negativa");
        else
            System.out.println("Temperatura la nivelul judetului Sibiu este in parametrii normali");
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

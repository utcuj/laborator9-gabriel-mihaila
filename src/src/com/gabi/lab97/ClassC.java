package com.gabi.lab97;

public class ClassC extends ClassB {

    private int c;

    public ClassC(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }


    public void verificaNegative(int a, int b, int c) throws Exceptie1 {
        super.verificaNegative(a, b);
        if(c < 0)
            throw new Exceptie3("Temperatura la nivelul localitatii Cisnadie este negativa ");
        else
            System.out.println("Temperatura la nivelul localitatii Cisnadie este in parametrii normali");
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

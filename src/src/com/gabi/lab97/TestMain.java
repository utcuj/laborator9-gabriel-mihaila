package com.gabi.lab97;

public class TestMain {
    public static void main(String[] args)  {

        ClassC temperatura = new ClassC(1,2,-1);


        try {
            temperatura.verificaNegative(temperatura.getA(),temperatura.getB(),temperatura.getC());
        }
        catch (Exceptie1 e2){
            System.out.println(e2.getMessage());
        }
    }
}

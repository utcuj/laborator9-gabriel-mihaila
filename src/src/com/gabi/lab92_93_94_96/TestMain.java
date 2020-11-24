package com.gabi.lab92_93_94_96;

public class TestMain {

    public static void f() throws ExceptieZiNelucratoare {
        throw new ExceptieZiNelucratoare("Exceptie 1");
    }

    public static void g() throws Exception {
        try
        {
            f();
        }
        catch (ExceptieZiNelucratoare e)
        {
            throw new Exception(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Zi zi1 = new Zi("Luni");
        Zi zi2 = null;
        System.out.println(zi1.getNume());

        try
        {
            System.out.println(zi2);
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }

        Zi zi[]= new Zi[2];
        zi[0] = zi1;
        zi[1] = zi2;

        try
        {
            zi[2] = zi1;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Se continua programul...");
        }

        try
        {
            g();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}

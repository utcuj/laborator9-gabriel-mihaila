package com.gabi.lab91;

public class TestMain {
    public static void main(String[] args) {

        Zi[] zile= new Zi[] {new Zi("Luni",true),
                new Zi("Marti",true),
                new Zi("Miercuri",true),
                new Zi("Joi",true),
                new Zi("Vineri",true),
                new Zi("Sambata",false),
                new Zi("Duminica",false)};

        CalendarLucru calendar= new CalendarLucru(zile);

        Lucrator l1= new Lucrator("Gigel",calendar);

        try
        {
            l1.lucreaza("Luni");
        }
        catch (ExcepetieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            l1.lucreaza("Sambata");
        }
        catch (ExcepetieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            l1.lucreaza("Marte");
        }
        catch (ExcepetieZiNelucratoare e)
        {
            System.out.println(e.getMessage());
        }
    }
}

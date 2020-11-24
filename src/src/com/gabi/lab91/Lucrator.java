package com.gabi.lab91;

public class Lucrator {
    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume, CalendarLucru calendar) {
        this.nume = nume;
        this.calendar = calendar;
    }

    public void lucreaza(String ziua) throws ExcepetieZiNelucratoare {
        int control;
        control=calendar.verificaZiua(ziua);
        if(control == 1)
            System.out.println("Lucratorul " + nume + " lucreaza " + ziua);
        else{
            if(control == 0)
                throw new ExcepetieZiNelucratoare("Lucratorul " + nume + " nu lucreaza " + ziua);
            else
                throw new ExcepetieZiNelucratoare(ziua + " nu este o zi din saptamana");
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public CalendarLucru getCalendar() {
        return calendar;
    }

    public void setCalendar(CalendarLucru calendar) {
        this.calendar = calendar;
    }
}

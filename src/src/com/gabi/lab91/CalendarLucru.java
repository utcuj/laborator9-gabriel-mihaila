package com.gabi.lab91;

public class CalendarLucru {
    private Zi[] saptamana;

    public CalendarLucru(Zi[] saptamana) {
        this.saptamana = saptamana;
    }

    public int verificaZiua(String ziua){

        for(Zi zi: saptamana){
            if(zi.getNume().equals(ziua)){
                if(zi.isProprietate())
                    return 1;
                else
                    return 0;
            }
        }

        return -1;

    }

    public Zi[] getSaptamana() {
        return saptamana;
    }

    public void setSaptamana(Zi[] saptamana) {
        this.saptamana = saptamana;
    }
}

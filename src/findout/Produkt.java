/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findout;

import java.util.Comparator;



/**
 *
 * @author Jerzy
 */
public class Produkt implements Comparator<Produkt>{
    private String nazwa;
    private String portal;
    private double cena;
    public Produkt(String nazwa, String portal, double cena){
        nazwa = this.nazwa;
        portal = this.portal;
        cena = this.cena;
    }
    String getnazwa(){return nazwa;}
    String getportal(){return portal;}
    double getcena(){return cena;}
    
    @Override
    public int compare(Produkt t1, Produkt t2) {
        if (t2 == null) return -1;
        if (t1.getcena()>t2.getcena())return 1;
        else if (t1.getcena()<t2.getcena())return -1;
        else return 0;
    }
    
}



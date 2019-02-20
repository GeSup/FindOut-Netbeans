/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findout.skrypty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import findout.Grafik;
import findout.Produkt;
import java.util.List;

/**
 *
 * @author Jerzy
 */
public class GramPl {

    String wybrana, tmp, wyniki;
    String gramPlSearch = "http://www.gram.pl/sklep.asp#s/query/";
   
    

    public GramPl() throws IOException {
        this.wybrana = Grafik.szukana;
        this.wyniki = Grafik.wynik;
        URL znalezione = new URL(gramPlSearch + wybrana + "/");
        try (BufferedReader in = new BufferedReader( new InputStreamReader(znalezione.openStream()))) {
            while ((tmp = in.readLine())!=null)
                wyniki += tmp + "\n";
        }
        Grafik.wynik = wyniki;
    }
    
}
    
/*class listaWynik{
    List<Produkt> biuldResultsFromRaw(String searchResultRaw){
        List<Produkt> results;
        return results;
    }
}*/
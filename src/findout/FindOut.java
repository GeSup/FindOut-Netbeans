/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findout;

import java.awt.EventQueue;

/**
 *
 * @author Jerzy
 */
public class FindOut {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Grafik().setVisible(true);
            }
        });
    }

}

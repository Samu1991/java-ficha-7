/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg07.ex1;

import Enum.MontainBikeSuspesion;
import Enum.Sponsor;
/**
 *
 * @author samum
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sponsor[] s1 = new Sponsor[3];
        s1[0] = Sponsor.NIKE;
        s1[1] = Sponsor.ADIDAS;
        s1[2] = Sponsor.PUMA;
        
        
        DeliveryBike db = new DeliveryBike(10.2f, true, s1,1,3, "blue", 0.5f, 
                2.2f, true,250.99f);
        MontainBike mb = new MontainBike(10, MontainBikeSuspesion.Dupla,1,3, 
                "red", 0.5f, 2.2f, true,250.99f);
        
        
        
         db.status();
         mb.status();
       
       
    }

   
    
}

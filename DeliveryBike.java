/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg07.ex1;



import Enum.Sponsor;
import java.util.Arrays;

/**
 *
 * @author samum
 */
public class DeliveryBike extends Bicycle {
    private float basketCapacity;
    private boolean isFrontBasket;
    private final int SPONSOR_SIZE=10;
    private Sponsor[] sponsors;
    private int numberOfSponsor;

    public DeliveryBike(float basketCapacity, boolean isFrontBasket, Sponsor[] sponsors,
            int id, int numberOfGears, String mainColor, float weelSize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGears, mainColor, weelSize, bikeLenght, adjustableSeatpost, price);
        this.basketCapacity = basketCapacity;
        this.isFrontBasket = isFrontBasket;
        this.sponsors = sponsors;
        this.numberOfSponsor= sponsors.length;
    }
    

    
    public float getBasketCapacity() {
        return basketCapacity;
    }

    public void setBasketCapacity(float basketCapacity) {
        this.basketCapacity = basketCapacity;
    }

    public boolean isIsFrontBasket() {
        return isFrontBasket;
    }

    public void setIsFrontBasket(boolean isFrontBasket) {
        this.isFrontBasket = isFrontBasket;
    }

    public Sponsor[] getSponsors() {
        return sponsors;
    }

    public void setSponsors(Sponsor[] sponsors) {
        this.sponsors = sponsors;
    }

    /**
     * Adicionar um sponsor
     * @param newSponsor
     * @return 
     */
    public int addSponsor(Sponsor newSponsor){
        for(int i=0; i<sponsors.length; i++){
            if(sponsors[i] == null){
                sponsors[i] = newSponsor;
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Remover um Sponsor
     * @param id
     * @return 
     */
    public boolean removeSponsor(int id){      
        if(id>=0 && id<sponsors.length && sponsors[id] != null){
            sponsors[id] = null;
            return true;
        }
        return false;
    }
     /**
     * Editar um Sponsor
     * @param id
     * @param newSponsor
     * @return 
     */
    public boolean editSponsor(int id, Sponsor newSponsor){       
        if(id>=0 && id<sponsors.length && sponsors[id] != null){
            sponsors[id] = newSponsor;
            return true;
        }
        return false;
    }
    
    /**
     * Listar Sponsor
     */
    public void listSponsor(){
        for (Sponsor sponsor : sponsors) {
            if(sponsor != null){
                System.out.println(sponsor.toString());
            }
        }
    }
    
    public void status(){
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t~ Delivery Bike ~");
        System.out.println("Basket Capacity: "+this.basketCapacity);
        System.out.println("Is Front Basket? "+this.isFrontBasket);
        System.out.println("Number of Sponsors: "+this.numberOfSponsor);
        System.out.println("Main Color: "+getMainColor());
        System.out.println("Sponsor: "+ Arrays.toString(sponsors));
    }
    
    
    
}


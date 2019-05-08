/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg07.ex1;
import Enum.MontainBikeSuspesion;

/**
 *
 * @author samum
 */
public class MontainBike extends Bicycle {
    
    private int numberOfLights;
    private MontainBikeSuspesion suspension;
    private BikeTools[] bikeTools;

    public MontainBike(int numberOfLights, MontainBikeSuspesion suspension, int id, int numberOfGears, String mainColor, float weelSize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGears, mainColor, weelSize, bikeLenght, adjustableSeatpost, price);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public MontainBikeSuspesion getSuspension() {
        return suspension;
    }

    public void setSuspension(MontainBikeSuspesion suspension) {
        this.suspension = suspension;
    }

    public BikeTools[] getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(BikeTools[] bikeTools) {
        this.bikeTools = bikeTools;
    }
    public void status(){
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t~ Montain Bike ~");
        System.out.println("Type of Suspenion: "+this.suspension);
        System.out.println("Main Color "+this.getMainColor());
        System.out.println("Number of lights: "+this.numberOfLights);
    }
    
    
}

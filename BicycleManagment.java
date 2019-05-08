/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg07.ex1;

/**
 *
 * @author samum
 */
public class BicycleManagment {
    private Bicycle[] bicycle;

    public BicycleManagment(Bicycle[] bicycle) {
       bicycle =new Bicycle[20];
    }

    public Bicycle[] getBicycle() {
        return bicycle;
    }

    public void setBicycle(Bicycle[] bicycle) {
        this.bicycle = bicycle;
    }
    
    public void print(){
        for (Bicycle bicycle1 : bicycle) {
            if(bicycle1 != null){
                System.out.println("Id: " + bicycle1.getId());
                System.out.println("Bike lenght: " + bicycle1.getBikeLenght());
                System.out.println("Main Color: " + bicycle1.getMainColor());
                System.out.println("Number of gears: " + bicycle1.getNumberOfGears());
                System.out.println("Get price: " + bicycle1.getPrice());
                System.out.println("Weel Size: " + bicycle1.getWeelSize());

                if(bicycle1 instanceof MontainBike){
                    System.out.println("Number of lights: " + ((MontainBike) bicycle1).getNumberOfLights());
                    System.out.println("Suspension: " + ((MontainBike) bicycle1).getSuspension());
                    System.out.println("Bike Tools: " + ((MontainBike) bicycle1).getBikeTools().toString());
                }else if(bicycle1 instanceof DeliveryBike){
                    System.out.println("Basket capacity: " + ((DeliveryBike) bicycle1).getBasketCapacity());
                    System.out.println("Sponsors: " + ((DeliveryBike) bicycle1).getSponsors().toString());
                }
            }           
        }
    }
    
    
    
    
}

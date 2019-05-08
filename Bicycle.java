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
public class Bicycle {
    private  int id;
    private int numberOfGears;
    private String mainColor;
    private float weelSize;
    private float bikeLenght;
    private boolean adjustableSeatpost;
    private float price;

    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize, float bikeLenght, boolean adjustableSeatpost, float price) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.bikeLenght = bikeLenght;
        this.adjustableSeatpost = adjustableSeatpost;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public float getWeelSize() {
        return weelSize;
    }

    public void setWeelSize(float weelSize) {
        this.weelSize = weelSize;
    }

    public float getBikeLenght() {
        return bikeLenght;
    }

    public void setBikeLenght(float bikeLenght) {
        this.bikeLenght = bikeLenght;
    }

    public boolean isAdjustableSeatpost() {
        return adjustableSeatpost;
    }

    public void setAdjustableSeatpost(boolean adjustableSeatpost) {
        this.adjustableSeatpost = adjustableSeatpost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}

package model;

/**
 * @author Esteban & Jennifer
 * Class defining the elements of a wood type
 */
public class WoodItem {

    static String type;

    static int numberOfBoardFoot;

    //private Double baseDeliveryTime;
    //private Double price;

    /**
     * Default constructor
     */
    public WoodItem(String type, int numberOfBoardFoot){
        this.type = type;
        this.numberOfBoardFoot = numberOfBoardFoot;
        //this.baseDeliveryTime = 0.0;
        //this.price = 0.0;

    }

    /**
     * Get the type of Wood
     *
     * @return Name of the WoodItem
     */
    // public String getType() {
    public static String getType() { return type; }

    public static int getNumberOfBoardFoot() {return numberOfBoardFoot;}

    public void setNumberOfBoardFoot(int numberOfBoardFoot) {
        this.numberOfBoardFoot = numberOfBoardFoot;
    }

    public void setItemType(String type) { this.type = type;}

    // public void results(){
    //    System.out.println ("Type" + type + "numberOfboardFoot" + numberOfBoardFoot);
    //  }
    @Override
    public String toString() {
        return "Type" + type + "numberOfboardFoot" + numberOfBoardFoot;


    /**
     * Constructor of a WoodItem element with parameters
     * @param type Name of the wood type
     * @param daseDeliveryTime base delivery time
     * @param price price per Bare Foot
     */
    //public WoodItem(String type, Double daseDeliveryTime, Double price) {
     //   this.type = type;
     //   this.baseDeliveryTime = daseDeliveryTime;
     //   this.price = price;
   // }



    /**
     * Get the base delivery time
     *
     * @return the baseDeliverytime
     */
    //public Double getDaseDeliveryTime() {
    //    return baseDeliveryTime;
  //  }

    /**
     *
     * Get the price per Bare Foot
     *
     * @return the price for 1 Bare Foot of this WoodItem
     */
    //public Double getPrice() {
     //   return price;
   // }


    }

}

package controller;
import model.WoodItem;
import java.util.Random;
import java.io.PrintStream;

import java.sql.Time;
import java.util.*;



/**
 * @author Esteban & Jennifer
 *
 */
public class HardwoodSeller {
    //The ultimate goal is to develop a program to compute the delivery time for the received orders
    //baseWoodPrices
    Map<String, Double> woodPrices = new HashMap();
    //baseDeliveryPrices
    Map<String, Double> baseDeliveryTime = new HashMap();
    //base delivery time
    List<WoodItem> orderedItemList = new ArrayList<>();
    //Note that HashMaps use put and ArrayLists use add


    //Note that there are 5 types of wood
    //Cherry
    //Curly Maple
    //Genuine Mohogany
    //Wenge
    //White Oak
    //Sawdust

    private List<WoodItem> createOrder(){
        List<WoodItem> orderedItems = new ArrayList<>();
        orderedItems.add(new WoodItem("Cherry", 100));
        orderedItems.add(new WoodItem("Curly Maple", 100));
        orderedItems.add(new WoodItem("Wenge", 250));
        orderedItems.add(new WoodItem("Sawdust", 755));
        orderedItems.add(new WoodItem("White Oak", 120));
        return orderedItems;
    }
    private void addWoodPrices(){
        //Map<String, Double> woodPrices = new HashMap();
        //Prices per Board Foot
        woodPrices.put("Cherry", 5.95);
        woodPrices.put("Curly Maple", 6.08);
        woodPrices.put("Genuine Mahogany", 9.60);
        woodPrices.put("Wenge", 22.35);
        woodPrices.put("White Oak", 6.78);
        woodPrices.put("Sawdust", 1.5);

    }

    private void addBaseDeliveryTime(){
        //Map<String, Double> baseDeliveryTime = new HashMap();
        baseDeliveryTime.put("Cherry", 2.5);
        baseDeliveryTime.put("Curly Maple", 1.5);
        baseDeliveryTime.put("Genuine Mahogany", 3.0);
        baseDeliveryTime.put("Wenge", 5.0);
        baseDeliveryTime.put("White Oak", 2.3);
        baseDeliveryTime.put("Sawdust", 1.0);

    }

    private double getBaseDeliveryTimeForBoardFoot(String woodName, int boardFoot)
    {
        double shippingTime = 0;  //starts at 0
        if (boardFoot < 100){
            shippingTime = 1;
         } else if(boardFoot < 200){
            shippingTime = 2;
         } else if(boardFoot < 300){
            shippingTime = 3;
         }else if(boardFoot < 400){
            shippingTime =4;
         }else if(boardFoot < 500){
            shippingTime = 5;
         }else if(boardFoot < 1000)
            shippingTime = 5;

        return shippingTime;

    }

    private String gen7DigitNumber()
    {
        Random random = new Random();
        int rand = random.nextInt(1000000);
        return String.format("%07d" , rand);
    }

    private void calculateMaxHoursForOrder(List<WoodItem> orderedItemList){
        List<Double> calculatedHours = new ArrayList<>();
        System.out.println("Order Details for Order Number :" ); //+ gen7DigitNumber NEED TO RETRIEVE ABOVE RESULT??
        double totalPrice=0;
        for(WoodItem item: orderedItemList){
            calculatedHours.add(getBaseDeliveryTimeForBoardFoot(WoodItem.getType(), WoodItem.getNumberOfBoardFoot()));
            //System.out.print("Item Ordered : " + WoodItem.getType()) + "\t");
            System.out.print("Price for an item: $" + totalPrice + "\n");
            double totalPriceForItem=woodPrices.get(item.getType())*item.getNumberOfBoardFoot();
            totalPrice= totalPrice+totalPriceForItem;

        }
    }




    //BF = board foot
    //Double deliveryETA = 0.0;
    // int c = 0;
    //if (BFcherry < 100){
    //if the BF of cherry is under 100, c = 1
    // c = 1;
    // } else if(BFcherry < 200){
    //  c = 2;
    // } else if(BFcherry < 300){
    //    c = 3;
    // }else if(BFcherry < 400){
    //    c =4;
    // }else if(BFcherry < 500){
    //    c = 5;
    // }else if(BFcherry < 1000)
    //    c = 5;



   public static void main(String[] args) {

   //     // TODO Auto-generated method stub

     //   System.out.println("Jennifer");

   // }

    /**
    * Method for reading the input file to be processed by the Hardwood Seller
     **/
  //  public void readInputFile(String inputFilePath){

    //What the costumer wants
        // A customer places an order with the following items: 100 BF of Cherry,
        // 250 BF of Wenge
        // 755 BF of sawdust
        // 120 BF of White Oak.
        // The delivery time for the order will be computed as follows:

        //plug in what the customer wants below

     //   BFcherry = 100;
     //   BFcurlymaple = 0;
     //   BFgenuinemahogany = 0;
     //   BFwenge = 250;
     //   BFsawdust = 755;
     //   BFwhiteoak = 120;

    }


    //Types of wood available
    //int BFcherry;
    // int BFwenge;
    // int BFwhiteoak;
    //int BFsawdust;
    // int BFcurlymaple;

    // int BFgenuinemahogany;































    //create price method
    //add them up
    //
   // public Double deliveryTime(){
        //BF = board foot
        //Double deliveryETA = 0.0;
       // int c = 0;
        //if (BFcherry < 100){
            //if the BF of cherry is under 100, c = 1
           // c = 1;
       // } else if(BFcherry < 200){
          //  c = 2;
       // } else if(BFcherry < 300){
        //    c = 3;
       // }else if(BFcherry < 400){
       //    c =4;
       // }else if(BFcherry < 500){
       //    c = 5;
       // }else if(BFcherry < 1000)
       //    c = 5;

        //int cm = 0;
      //  if(BFcurlymaple < 100) {
      //      cm = 1;
      //  } else if(BFcurlymaple < 200){
      //      cm = 2;
       // } else if(BFcurlymaple < 300){
       //     cm = 3;
      //  }else if(BFcurlymaple < 400){
     //       cm =4;
       // }else if(BFcurlymaple < 500){
      //      cm = 5;
     //   }else if(BFcurlymaple < 1000)
      //      cm = 5;

        //Cherry delivery time
       // double cdt = c * 2.5;
        //Curly Maple delivery time
     //   double cmdt = cm * 1.5;
        //Curly Maple delivery time
        //Genuine Mahogany delivery time
        //Wenge delivery time
        //White Oak delivery time
        //Sawdust delivery time


      //  return deliveryETA;
  //  }
    //public int pricemethod(int cdt, int cmdt, int   ) {
    //    int total = (cdt + cmdt);
     //   return total;
   // }









}
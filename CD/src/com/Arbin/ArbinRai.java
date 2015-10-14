package com.Arbin;

/**
 * Created by lt3733yt on 10/14/2015.
 */
public class ArbinRai {
public void claculateCosts(int price){
    int total=0;
    total=total+price;
    int grandTotal=total+((5/100)*total);

    System.out.println("The total price of the selected CDs and LPs is "+grandTotal+".");

}
}


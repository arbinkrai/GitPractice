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

    //public class DinosaurSupervisor {

        public static void main(String[] args) {

            //Create dinosaur objects
            Dinosaur trex = new Dinosaur();
            Dinosaur velociraptor = new Dinosaur();
            Dinosaur diplodocus = new Dinosaur();

            //Call roar methods
            trex.roar();
            velociraptor.roar();
            diplodocus.roar();

            //Test color attribure of dinosaur object
            trex.color = "blue";
            System.out.println("A T-Rex is " + trex.color);
        }
    }





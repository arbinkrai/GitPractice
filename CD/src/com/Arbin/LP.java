package com.Arbin;

/**
 * Created by lt3733yt on 10/12/2015.
 */

public class LP extends Album{


    //private String artist; //deleated after having superclass Album
    //private String title; //deleated after having superclass Album
    private int condition;   //1 = barely playable, 5 = mint
    //private double price; //deleated after having superclass Album

    public LP(String artist, String title, int condition, double price) {
        this.artist = artist;
        this.title = title;
        this.condition = condition;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Format = LP, Artist = " + this.artist + ", Title = " + title + ",      Condition = " + this.condition  + ", Price $" + this.price;
    }
}



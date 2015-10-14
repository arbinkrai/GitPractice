package com.Arbin;
/**
 * Created by lt3733yt on 10/12/2015.
 */
public class CD extends Album{

    //private String artist;// deleated after having superclass Album
    //private String title; //deleated after having superclass Album
    //private double price; //deleated after having superclass Album

    public CD(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Format = CD, Artist = " + this.artist + ", Title = " + title + ", Price 				$" + this.price;
    }
}

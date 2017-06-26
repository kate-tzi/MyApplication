package com.katerina.myapplication.Stores;

import java.io.Serializable;

/*** Created by cathr on 26/6/2017. ***/

public class Store implements Serializable {
    private int id,review;
    private String legalName, category, address;


    public Store(int id, String legalName, String category, String address, int review){
        this.id = id;
        this.legalName = legalName;
        this.category = category;
        this.address = address;
        this.review = review;
    }


    public int getId(){
        return id;
    }

    public String getLegalName() {
        return legalName;
    }

    public String getCategory() {
        return category;
    }

    public String getAddress() {
        return address;
    }

    public int getReview() {
        return review;
    }


}
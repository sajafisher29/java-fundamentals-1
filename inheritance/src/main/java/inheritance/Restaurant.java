package inheritance;

import java.util.*;


import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String price;
    private Integer numStars;
    private long starsTotal;
    private long numOfReviews;
    ArrayList<Review> reviews = new ArrayList<Review>();

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

}

package inheritance;

import java.util.ArrayList;

public class Theater {
    public String name;
    public String price;
    public int star;
    ArrayList<Review> reviews = new ArrayList<>();
    ArrayList<String> movies = new ArrayList<>();

    public Theater(String name, String price){
        this.name = name;
        this.price = price;
        this.star = 0;
    }

    public String toString(){
        return "Name: " + this.name + ", Price: " + this.price + ", Rating: " + this.star;
    }



    public void addReview(Review potato){
        reviews.add(potato);
        potato.theater = this;
        updateStars();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        if(movies.contains(movie))
            movies.remove(movie);
    }


    private void updateStars(){
        //create variable to store sum
        //loop over reviews and add stars
        //divide sum by number of reviews
        //update star
        int total = 0;
        for (int i = 0; i < reviews.size(); i++){
            total += reviews.get(i).stars;
        }
        total /= reviews.size();
        this.star = total;
    }


}

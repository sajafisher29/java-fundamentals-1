import java.util.HashSet;

public class Shop {
   
    private long starsTotal;
    private HashSet<Review> reviews = new HashSet();

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Integer getNumStars() {
        return numStars;
    }

    public String getDescription() {
        return description;
    }

    public HashSet<Review> getReviews() {
        return reviews;
    }

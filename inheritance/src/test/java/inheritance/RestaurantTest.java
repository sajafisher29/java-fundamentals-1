package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testConstructor(){
        Restaurant wendy = new Restaurant("wendys", "$$$");
        Restaurant tacoBell = new Restaurant("Taco Bell", "$");

        String wendyExpectedOutPut = "Name: wendys, Price: $$$, Rating: 0";
        String tacoBellExpectedOutPut = "Name: Taco Bell, Price: $, Rating: 0";

        assertEquals(wendyExpectedOutPut, wendy.toString());
        assertEquals(tacoBellExpectedOutPut, tacoBell.toString());
    }



    @Test
    public void testAddReview(){
        //creating 2 Review instances
        Review review1 = new Review("good", "joe", 5);
        Review review2 = new Review("bad", "bobby", 1);

        //to create a Restaurant instance
        Restaurant wendy = new Restaurant("wendys", "$$$");

        //check that wendy's has no reviews and zero stars;
        assertEquals(0, wendy.reviews.size());
        assertEquals(0, wendy.star);

        //check wendy after 1 review
        wendy.addReview(review1);
        assertEquals(1, wendy.reviews.size());
        assertEquals(5, wendy.star);

        //check wendy after 2 review
        wendy.addReview(review2);
        assertEquals(2, wendy.reviews.size());
        assertEquals(3, wendy.star);
    }

}
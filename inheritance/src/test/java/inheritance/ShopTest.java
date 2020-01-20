package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testConstructor(){
        Shop walmart = new Shop("walmart", "$$$");
        Shop target = new Shop("target", "$");

        String walmartExpectedOutPut = "Name: walmart, Price: $$$, Rating: 0";
        String targetExpectedOutPut = "Name: target, Price: $, Rating: 0";

        assertEquals(walmartExpectedOutPut, walmart.toString());
        assertEquals(targetExpectedOutPut, target.toString());
    }



    @Test
    public void testAddReview(){
        //creating 2 Review instances
        Review review1 = new Review("good", "joe", 5);
        Review review2 = new Review("bad", "bobby", 1);

        //to create a Restaurant instance
        Shop walmart = new Shop("walmart", "$$$");

        //check that wendy's has no reviews and zero stars;
        assertEquals(0, walmart.reviews.size());
        assertEquals(0, walmart.star);

        //check wendy after 1 review
        walmart.addReview(review1);
        assertEquals(1, walmart.reviews.size());
        assertEquals(5, walmart.star);

        //check wendy after 2 review
        walmart.addReview(review2);
        assertEquals(2, walmart.reviews.size());
        assertEquals(3, walmart.star);
    }


}
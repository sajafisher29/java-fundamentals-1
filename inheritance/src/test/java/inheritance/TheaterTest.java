package inheritance;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater Theater;
    @Test
    public void testConstructor(){
        Theater joker = new Theater("joker", "$$$");
        Theater purge = new Theater("purge", "$");

        String jokerExpectedOutPut = "Name: joker, Price: $$$, Rating: 0";
        String purgeExpectedOutPut = "Name: purge, Price: $, Rating: 0";

        assertEquals(jokerExpectedOutPut, joker.toString());
        assertEquals(purgeExpectedOutPut, purge.toString());
    }



    @Test
    public void testAddReview(){
        //creating 2 Review instances
        Theater review1 = new Theater("joker", "joe", 5);
        Theater review2 = new Theater("purge", "bobby", 1);

        //to create a movie instance
        Theater joker = new Theater("joker", "$$$");

        //check that movie has no reviews and zero stars;
        assertEquals(0, joker.reviews.size());
        assertEquals(0, joker.star);

        //check movie after 1 review
        joker.addReview(review1);
        assertEquals(1, joker.reviews.size());
        assertEquals(5, joker.star);

        //check wendy after 2 review
        joker.addReview(review2);
        assertEquals(2, joker.reviews.size());
        assertEquals(3, joker.star);
    }



    @Test
    public void testAddMovie(){
        Theater movieone = new Theater("joker");
        Theater movietwo = new Theater("purge");
        assertEquals(movieone.addMovie());
        assertEquals(movietwo.addMovie());

    }
    @Test
    public void testRemoveMoive(){
        Theater movieone = new Theater("joker");
        Theater movietwo = new Theater("purge");
        assertEquals(movieone.removeMovie());
        assertEquals(movietwo.removeMovie());
    }


}
package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void constructorTest(){
        //creating 2 Review instances
        Review review1 = new Review("good", "joe", 5);
        Review review2 = new Review("bad", "bobby", 1);

        //expected outputs of the toString method
        String review1ExpectedOutPut = "joe says: good";
        String review2ExpectedOutPut = "bobby says: bad";

        //comparing actual result to what we think the result should be
        assertEquals(review1ExpectedOutPut, review1.toString());
        assertEquals(review2ExpectedOutPut, review2.toString());


    }

    @Test
    public void testMovieName(){
        Review review1 = new Review("good", "joe", 5, "joker");
        Review review2 = new Review("bad", "bobby", 1, "bobbyjoe");
        assertEquals("joker", review1.getMovieName());
        assertEquals("bobbyjoe", review2.getMovieName());

    }


}
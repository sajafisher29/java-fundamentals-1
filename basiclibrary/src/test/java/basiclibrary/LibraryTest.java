package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;



import java.util.*;


public class LibraryTest {

    @Test public void testRoll(){
        int input = 4;
        int[] expected = Library.roll(input);
        assertEquals(input, expected.length);
    }

    @Test public void rollBetween1and6(){
        int[] expected = Library.roll(4);
        for(int num : expected){
            boolean actual = num > 0 && num < 7;
            assertTrue(actual);
        }
    }

    @Test public void testContainsDuplicates(){
        String[] input = {"a", "b", "c", "a"};
        boolean actual = Library.containsDuplicates(input);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test public void testNoContainDuplicates(){
        String[] input = {"a", "b", "c"};
        boolean actual = Library.containsDuplicates(input);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test public void testCalculatingAverage(){
        int[] input = {1, 2, 3, 4, 5};
        int actual = Library.calculatingAverage(input);
        int expected = 3;
        assertEquals(actual,expected);
    }

    @Test public void testArrayAverage(){
        int[][] input = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int actual = Library.arrayAverage(input);
        int expected = 57;
        assertEquals(actual, expected);
    }

    @Test public void testTallyMethod() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        assertEquals("It should return bush",
                "Bush",
                Library.tally(votes));
    }


}
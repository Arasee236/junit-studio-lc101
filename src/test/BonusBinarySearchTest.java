package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    @Test
    public void emptyTest() {
        assertEquals(true,true);
    }
    int testArray[] = {3,5,7,9,17};

    @Test
    public void searchOfNumberInArrayReturnsIndexOfTheNumber(){
        int expected = BonusBinarySearch.binarySearch(testArray,3);
        assertEquals(expected,0);
    }

    @Test
    public void searchOfNumberNotInArrayReturnsMinusOne(){
        assertEquals(BonusBinarySearch.binarySearch(testArray,27),-1);
    }
}

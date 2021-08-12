package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void matchingBracketsWithStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void emptyStringWithoutBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void matchedBracketsWithinStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void matchedBracketsWithMultiStringsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[Rocks]; CoderG[irl]"));
    }
    @Test
    public void matchedBracketsWithNoStringsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[                      ][]"));
    }

    @Test
    public void matchedBracketswithMultiLineStringsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch[Code] rocks!" + "\n Coder[]Girl" + "\n Java Web[DevelopmentTrack]"));
    }

    //test cases that return false

    @Test
    public void singleBracketWithNoStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleBracketwithinStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }
    @Test
    public void misMatchedBracketsWithNoStringsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]][][]["));
    }

    @Test
    public void misMatchedBracketsWithMultipleStringsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode] Rocks][]"));
    }

    @Test
    public void misMatchedBracketsWithMultiLineStringsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launhcode ]][ ][[" +" \n Coder]][]Girl][" + "\n Java][] Web Development" + "\n Rocks!!![]]"));

    }

}

package reverse.controller;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReverseControllerTest
{
    private ReverseController reverseController;

    @Before
    public void setUp() throws Exception
    {
        reverseController = new ReverseController();
    }

    /**
     * This test makes the assumption that the null are ignored completely
     */
    @Test
    public void getReverseWord()
    {
        List<String> input = Arrays.asList("Apple", "banana", "fork", "book", "cat", null);
        List<String> response = reverseController.getReverseWord(input);
        assertEquals(5, response.size());
        assertEquals("elppA", response.get(0));
        assertEquals("ananab", response.get(1));
        assertEquals("krof", response.get(2));
        assertEquals("koob", response.get(3));
        assertEquals("tac", response.get(4));
    }

    @Test
    public void getReverseWord_empty_list()
    {
        List<String> input = Collections.emptyList();
        List<String> response = reverseController.getReverseWord(input);
        assertEquals(0, response.size());
    }

    /**
     * This test makes the assumption that the null are ignored completely
     */
    @Test
    public void getPalindrome()
    {
        List<Integer> input = Arrays.asList(101, 203, 20202, 333, 4004, 918, null);
        List<Integer> response = reverseController.gePalindrome(input);
        assertEquals(4, response.size());
        assertEquals((Integer) 101, response.get(0));
        assertEquals((Integer) 20202, response.get(1));
        assertEquals((Integer) 333, response.get(2));
        assertEquals((Integer) 4004, response.get(3));
    }

    @Test
    public void getPalindrome_empty_list()
    {
        List<Integer> input = Collections.emptyList();
        List<Integer> response = reverseController.gePalindrome(input);
        assertEquals(0, response.size());
    }

    /**
     * This test makes the assumption that the null are ignored completely
     */
    @Test
    public void getCommaSeperatedString()
    {
        List<Integer> input = Arrays.asList(0, 1, 2, 3, 4, 5, 6, null);
        String response = reverseController.getCommaSeperatedString(input);
        assertEquals("e0,o1,e2,o3,e4,o5,e6", response);
    }

    @Test
    public void getCommaSeperatedString_empty_list()
    {
        List<Integer> input = Collections.emptyList();
        String response = reverseController.getCommaSeperatedString(input);
        assertEquals("", response);
    }
}

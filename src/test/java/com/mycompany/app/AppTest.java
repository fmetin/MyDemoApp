package com.mycompany.app;
import java.util.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
     public void testFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("fatih","Tobb","Fail"));
      assertTrue(new App().search(array, "fa",1));
    }

    public void testNotFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("fatih","Tobb","Fail"));
      assertFalse(new App().search(array, "fa",3));
    }

    public void testEmptyArray() {
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array, "fatih",5));
    }

    public void testNull() {
      assertFalse(new App().search(null, "fatih",5));
    }
     public void testBadInt() {
	ArrayList<String> array = new ArrayList<>(Arrays.asList("fatih","Tobb","Fail"));
        assertFalse(new App().search(array, "fa",-1));
    }

}

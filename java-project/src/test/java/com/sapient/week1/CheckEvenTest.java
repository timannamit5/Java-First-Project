package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CheckEvenTest 
    extends TestCase
{
    
    public CheckEvenTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( CheckEvenTest.class );
    }

    public void testApp1()
    {
        boolean x = CheckEven.check(5);
        assertTrue( x == false );
    }

     public void testApp2()
    {
        boolean x = CheckEven.check(10);
        assertTrue( x == true );
    }

     public void testApp3()
    {
        boolean x = CheckEven.check(9);
        assertTrue( x == false );
    }

     public void testApp4()
    {
        boolean x = CheckEven.check(11);
        assertTrue( x == false );
    }

}

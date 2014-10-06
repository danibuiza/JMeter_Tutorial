package com.danibuiza.jmeter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JMeterTest
{

    public JMeterTest()
    {
        // just for testing purposes
        System.out.println( "calling the constructor" );
    }

    @Before
    public void setUp() throws Exception
    {
        // just for testing purposes
        System.out.println( "calling setup" );
    }

    @After
    public void tearDown() throws Exception
    {
        // just for testing purposes
        System.out.println( "calling tearDown" );

    }

    @Test
    public void testMe()
    {
        for( int i = 0; i < 30; i++ )
        {
            // just asserting randomly in order to check what happens in each case
            int randomNumber = (int)( Math.random() * 100 );
            System.out.println( randomNumber );
            assertEquals( 0, randomNumber % 2 );
        }
    }
}

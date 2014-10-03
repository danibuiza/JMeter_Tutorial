package com.danibuiza.jmeter.tests;

import junit.framework.TestCase;

public class JMeterTestTest extends TestCase
{

    public JMeterTestTest()
    {
        System.out.println( "constructor" );
    }

    @Override
    protected void setUp() throws Exception
    {
        System.out.println( "calling setup" );
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception
    {
        System.out.println( "calling tearDown" );

        super.tearDown();
    }

    public void testMe()
    {
        JMeterTest jmeter = new JMeterTest();
    }
}

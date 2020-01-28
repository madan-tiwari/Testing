package com.madantiwari.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult = arithmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }
}

package com.junitassertiontest;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {
    @Test
    public void assertionTests() {
        String string1 = "Khyathi";
        String string2 = "Khyathi";

        Object obj1 = new Object();
        Object obj2 = new Object();

        String str1 = null;

        int variable1 = 1;
        int variable2 = 2;

        int[] arithmeticArray1 = {1,2,3};
        int[] arithmeticArray2 = {1,2,3};

        Assert.assertEquals(string1,string2);
        Assert.assertSame(string1,string2);
        Assert.assertSame(obj1,obj1);
        Assert.assertNotSame(obj1,obj2);
//        Assert.assertNotNull(str1);
        Assert.assertNull(str1);
        Assert.assertTrue(variable1 < variable2);
        Assert.assertArrayEquals(arithmeticArray1,arithmeticArray2);
    }
}

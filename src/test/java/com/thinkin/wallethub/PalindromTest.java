package com.thinkin.wallethub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromTest {

    Palindrom palindrom = new Palindrom();

    @Test
    public void isPalindrom() throws Exception {
        Assert.assertTrue(palindrom.isPalindrom("a"));
        Assert.assertTrue(palindrom.isPalindrom("aba"));
        Assert.assertTrue(palindrom.isPalindrom("abba"));
        Assert.assertTrue(palindrom.isPalindrom("abcba"));
        Assert.assertFalse(palindrom.isPalindrom("ashish"));
        Assert.assertFalse(palindrom.isPalindrom("rajesh"));
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
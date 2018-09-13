package com.thinkin.wallethub;

import org.junit.Assert;
import org.junit.Test;

public class ComplimentryPairTest {
    ComplimentryPair complimentryPair = new ComplimentryPair();

    @Test
    public void checkNoOfComplementryPair() {
        int arr[] = {4, 5, 6, 3, 1, 8, -7, -6};
        int k = 1;
        Assert.assertEquals(2, complimentryPair.noOfComplimentryPairUsingEight(arr, k));
        Assert.assertEquals(2, complimentryPair.noOfComplimentaryPair(arr, k));
    }


}
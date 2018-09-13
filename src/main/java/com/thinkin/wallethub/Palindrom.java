package com.thinkin.wallethub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Palindrom {
    final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public boolean isPalindrom(String source) {
        int length = source.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        return source.equals(reverse);
    }

}

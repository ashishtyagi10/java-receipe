package com.thinkin.concurency;

import org.springframework.stereotype.Component;

@Component
public class ExpensiveObject {
    public ExpensiveObject() {
        System.out.println("I am very expensive to create");
    }
}

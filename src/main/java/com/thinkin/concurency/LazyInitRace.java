package com.thinkin.concurency;

/**
 * What happen if two thread access the getInstance() at the same time. We got Lazy Race condition
 *
 * @Author Ashish Tyagi
 */
public class LazyInitRace {
    private ExpensiveObject instance = null;

    public ExpensiveObject getInstance() {
        if (instance == null)
            instance = new ExpensiveObject();
        return instance;
    }
}

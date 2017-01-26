package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28064 {
    private final Productionnull_28064 production = new Productionnull_28064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
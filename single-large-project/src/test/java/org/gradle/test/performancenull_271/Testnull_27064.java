package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27064 {
    private final Productionnull_27064 production = new Productionnull_27064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
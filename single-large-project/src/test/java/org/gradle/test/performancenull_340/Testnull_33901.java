package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33901 {
    private final Productionnull_33901 production = new Productionnull_33901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
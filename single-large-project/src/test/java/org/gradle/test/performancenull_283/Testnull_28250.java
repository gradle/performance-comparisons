package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28250 {
    private final Productionnull_28250 production = new Productionnull_28250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36789 {
    private final Productionnull_36789 production = new Productionnull_36789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
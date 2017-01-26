package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31681 {
    private final Productionnull_31681 production = new Productionnull_31681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41080 {
    private final Productionnull_41080 production = new Productionnull_41080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
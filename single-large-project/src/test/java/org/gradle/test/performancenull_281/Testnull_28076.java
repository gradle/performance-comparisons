package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28076 {
    private final Productionnull_28076 production = new Productionnull_28076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
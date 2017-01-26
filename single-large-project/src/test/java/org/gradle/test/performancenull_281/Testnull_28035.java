package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28035 {
    private final Productionnull_28035 production = new Productionnull_28035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24930 {
    private final Productionnull_24930 production = new Productionnull_24930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
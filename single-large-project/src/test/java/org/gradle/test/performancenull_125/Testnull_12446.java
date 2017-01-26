package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12446 {
    private final Productionnull_12446 production = new Productionnull_12446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
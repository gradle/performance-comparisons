package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1469 {
    private final Productionnull_1469 production = new Productionnull_1469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
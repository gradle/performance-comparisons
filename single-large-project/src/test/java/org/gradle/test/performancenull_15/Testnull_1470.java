package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1470 {
    private final Productionnull_1470 production = new Productionnull_1470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
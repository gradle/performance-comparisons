package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1542 {
    private final Productionnull_1542 production = new Productionnull_1542("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
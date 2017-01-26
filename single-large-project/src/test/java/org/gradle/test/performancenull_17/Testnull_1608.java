package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1608 {
    private final Productionnull_1608 production = new Productionnull_1608("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
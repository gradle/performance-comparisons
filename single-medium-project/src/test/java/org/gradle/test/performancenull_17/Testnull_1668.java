package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1668 {
    private final Productionnull_1668 production = new Productionnull_1668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
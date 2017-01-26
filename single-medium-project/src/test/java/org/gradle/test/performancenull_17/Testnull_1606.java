package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1606 {
    private final Productionnull_1606 production = new Productionnull_1606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
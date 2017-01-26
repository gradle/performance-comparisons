package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1699 {
    private final Productionnull_1699 production = new Productionnull_1699("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
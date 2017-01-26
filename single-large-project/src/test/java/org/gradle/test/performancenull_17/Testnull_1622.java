package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1622 {
    private final Productionnull_1622 production = new Productionnull_1622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
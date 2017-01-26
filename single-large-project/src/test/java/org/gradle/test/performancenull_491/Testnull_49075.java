package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49075 {
    private final Productionnull_49075 production = new Productionnull_49075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
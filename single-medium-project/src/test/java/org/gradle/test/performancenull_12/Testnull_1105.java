package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1105 {
    private final Productionnull_1105 production = new Productionnull_1105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
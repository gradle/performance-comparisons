package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12606 {
    private final Productionnull_12606 production = new Productionnull_12606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
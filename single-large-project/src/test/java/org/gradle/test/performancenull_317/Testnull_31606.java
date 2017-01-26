package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31606 {
    private final Productionnull_31606 production = new Productionnull_31606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
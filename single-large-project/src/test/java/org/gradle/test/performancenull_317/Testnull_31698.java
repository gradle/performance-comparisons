package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31698 {
    private final Productionnull_31698 production = new Productionnull_31698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12343 {
    private final Productionnull_12343 production = new Productionnull_12343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
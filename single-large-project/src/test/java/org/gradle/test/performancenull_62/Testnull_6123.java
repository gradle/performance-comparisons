package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6123 {
    private final Productionnull_6123 production = new Productionnull_6123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
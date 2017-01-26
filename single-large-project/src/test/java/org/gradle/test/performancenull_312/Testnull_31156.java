package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31156 {
    private final Productionnull_31156 production = new Productionnull_31156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
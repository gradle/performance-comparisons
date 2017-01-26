package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1762 {
    private final Productionnull_1762 production = new Productionnull_1762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1701 {
    private final Productionnull_1701 production = new Productionnull_1701("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
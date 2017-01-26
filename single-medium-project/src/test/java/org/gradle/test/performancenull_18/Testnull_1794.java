package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1794 {
    private final Productionnull_1794 production = new Productionnull_1794("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
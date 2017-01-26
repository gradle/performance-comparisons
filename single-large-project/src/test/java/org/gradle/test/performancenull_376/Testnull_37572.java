package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37572 {
    private final Productionnull_37572 production = new Productionnull_37572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
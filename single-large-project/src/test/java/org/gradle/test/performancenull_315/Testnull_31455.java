package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31455 {
    private final Productionnull_31455 production = new Productionnull_31455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
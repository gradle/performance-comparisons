package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10088 {
    private final Productionnull_10088 production = new Productionnull_10088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
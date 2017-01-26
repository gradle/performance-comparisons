package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24702 {
    private final Productionnull_24702 production = new Productionnull_24702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
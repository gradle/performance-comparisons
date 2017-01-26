package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36145 {
    private final Productionnull_36145 production = new Productionnull_36145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32622 {
    private final Productionnull_32622 production = new Productionnull_32622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
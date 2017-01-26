package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21464 {
    private final Productionnull_21464 production = new Productionnull_21464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
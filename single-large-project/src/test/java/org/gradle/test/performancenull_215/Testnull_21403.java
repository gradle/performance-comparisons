package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21403 {
    private final Productionnull_21403 production = new Productionnull_21403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
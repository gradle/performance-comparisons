package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15971 {
    private final Productionnull_15971 production = new Productionnull_15971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
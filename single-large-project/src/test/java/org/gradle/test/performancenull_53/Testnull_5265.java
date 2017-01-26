package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5265 {
    private final Productionnull_5265 production = new Productionnull_5265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
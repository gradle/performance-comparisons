package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5080 {
    private final Productionnull_5080 production = new Productionnull_5080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
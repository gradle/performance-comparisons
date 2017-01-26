package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26080 {
    private final Productionnull_26080 production = new Productionnull_26080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
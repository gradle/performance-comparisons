package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18259 {
    private final Productionnull_18259 production = new Productionnull_18259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
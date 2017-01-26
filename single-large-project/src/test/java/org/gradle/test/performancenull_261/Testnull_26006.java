package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26006 {
    private final Productionnull_26006 production = new Productionnull_26006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
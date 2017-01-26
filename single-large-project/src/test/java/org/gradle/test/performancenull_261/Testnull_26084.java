package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26084 {
    private final Productionnull_26084 production = new Productionnull_26084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
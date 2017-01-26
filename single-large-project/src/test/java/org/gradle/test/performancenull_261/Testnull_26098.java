package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26098 {
    private final Productionnull_26098 production = new Productionnull_26098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
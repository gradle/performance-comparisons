package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26072 {
    private final Productionnull_26072 production = new Productionnull_26072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
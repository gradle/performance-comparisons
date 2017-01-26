package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26066 {
    private final Productionnull_26066 production = new Productionnull_26066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
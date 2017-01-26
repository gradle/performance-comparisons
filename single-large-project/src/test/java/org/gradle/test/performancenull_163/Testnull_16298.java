package org.gradle.test.performancenull_163;

import static org.junit.Assert.*;

public class Testnull_16298 {
    private final Productionnull_16298 production = new Productionnull_16298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
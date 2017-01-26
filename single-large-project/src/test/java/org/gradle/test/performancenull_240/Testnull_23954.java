package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23954 {
    private final Productionnull_23954 production = new Productionnull_23954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
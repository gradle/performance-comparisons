package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23603 {
    private final Productionnull_23603 production = new Productionnull_23603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
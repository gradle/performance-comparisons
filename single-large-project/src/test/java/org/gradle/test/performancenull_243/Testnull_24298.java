package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24298 {
    private final Productionnull_24298 production = new Productionnull_24298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
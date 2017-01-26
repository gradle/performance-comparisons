package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12432 {
    private final Productionnull_12432 production = new Productionnull_12432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25578 {
    private final Productionnull_25578 production = new Productionnull_25578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11443 {
    private final Productionnull_11443 production = new Productionnull_11443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
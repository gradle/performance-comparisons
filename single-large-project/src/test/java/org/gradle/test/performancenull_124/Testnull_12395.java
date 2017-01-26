package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12395 {
    private final Productionnull_12395 production = new Productionnull_12395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
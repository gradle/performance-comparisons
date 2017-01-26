package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31445 {
    private final Productionnull_31445 production = new Productionnull_31445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31480 {
    private final Productionnull_31480 production = new Productionnull_31480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
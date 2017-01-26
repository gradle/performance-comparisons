package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3735 {
    private final Productionnull_3735 production = new Productionnull_3735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24132 {
    private final Productionnull_24132 production = new Productionnull_24132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
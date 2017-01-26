package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25171 {
    private final Productionnull_25171 production = new Productionnull_25171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
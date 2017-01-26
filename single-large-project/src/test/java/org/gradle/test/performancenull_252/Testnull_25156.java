package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25156 {
    private final Productionnull_25156 production = new Productionnull_25156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
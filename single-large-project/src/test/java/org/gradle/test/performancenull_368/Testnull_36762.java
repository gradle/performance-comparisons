package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36762 {
    private final Productionnull_36762 production = new Productionnull_36762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
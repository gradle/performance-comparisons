package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12749 {
    private final Productionnull_12749 production = new Productionnull_12749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
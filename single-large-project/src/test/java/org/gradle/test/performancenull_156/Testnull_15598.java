package org.gradle.test.performancenull_156;

import static org.junit.Assert.*;

public class Testnull_15598 {
    private final Productionnull_15598 production = new Productionnull_15598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
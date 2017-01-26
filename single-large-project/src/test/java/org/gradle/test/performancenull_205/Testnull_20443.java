package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20443 {
    private final Productionnull_20443 production = new Productionnull_20443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
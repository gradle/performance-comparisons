package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13458 {
    private final Productionnull_13458 production = new Productionnull_13458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
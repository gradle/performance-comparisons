package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19185 {
    private final Productionnull_19185 production = new Productionnull_19185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
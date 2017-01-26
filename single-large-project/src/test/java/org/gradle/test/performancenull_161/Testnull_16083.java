package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16083 {
    private final Productionnull_16083 production = new Productionnull_16083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
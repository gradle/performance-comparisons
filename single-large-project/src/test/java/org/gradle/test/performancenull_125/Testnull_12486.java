package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12486 {
    private final Productionnull_12486 production = new Productionnull_12486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12490 {
    private final Productionnull_12490 production = new Productionnull_12490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
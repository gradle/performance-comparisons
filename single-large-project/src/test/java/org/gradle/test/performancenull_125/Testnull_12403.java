package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12403 {
    private final Productionnull_12403 production = new Productionnull_12403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
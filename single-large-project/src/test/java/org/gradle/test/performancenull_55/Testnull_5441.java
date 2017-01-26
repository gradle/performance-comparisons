package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5441 {
    private final Productionnull_5441 production = new Productionnull_5441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
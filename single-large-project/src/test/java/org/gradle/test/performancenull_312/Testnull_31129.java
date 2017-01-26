package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31129 {
    private final Productionnull_31129 production = new Productionnull_31129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
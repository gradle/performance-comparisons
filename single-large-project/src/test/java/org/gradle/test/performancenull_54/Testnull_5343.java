package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5343 {
    private final Productionnull_5343 production = new Productionnull_5343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
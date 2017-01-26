package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5398 {
    private final Productionnull_5398 production = new Productionnull_5398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
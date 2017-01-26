package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23598 {
    private final Productionnull_23598 production = new Productionnull_23598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
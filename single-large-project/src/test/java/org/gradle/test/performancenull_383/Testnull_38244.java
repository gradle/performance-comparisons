package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38244 {
    private final Productionnull_38244 production = new Productionnull_38244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
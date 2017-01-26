package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42290 {
    private final Productionnull_42290 production = new Productionnull_42290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
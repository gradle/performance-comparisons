package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37209 {
    private final Productionnull_37209 production = new Productionnull_37209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
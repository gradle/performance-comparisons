package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37275 {
    private final Productionnull_37275 production = new Productionnull_37275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
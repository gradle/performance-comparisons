package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5290 {
    private final Productionnull_5290 production = new Productionnull_5290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
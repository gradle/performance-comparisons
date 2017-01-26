package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7403 {
    private final Productionnull_7403 production = new Productionnull_7403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
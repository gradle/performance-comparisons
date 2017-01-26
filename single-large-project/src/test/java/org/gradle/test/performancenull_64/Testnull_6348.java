package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6348 {
    private final Productionnull_6348 production = new Productionnull_6348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
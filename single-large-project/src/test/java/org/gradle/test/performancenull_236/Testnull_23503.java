package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23503 {
    private final Productionnull_23503 production = new Productionnull_23503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
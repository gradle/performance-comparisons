package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24101 {
    private final Productionnull_24101 production = new Productionnull_24101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
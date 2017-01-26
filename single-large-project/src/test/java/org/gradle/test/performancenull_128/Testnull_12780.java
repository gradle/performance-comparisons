package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12780 {
    private final Productionnull_12780 production = new Productionnull_12780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
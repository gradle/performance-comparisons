package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41290 {
    private final Productionnull_41290 production = new Productionnull_41290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
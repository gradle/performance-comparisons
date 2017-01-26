package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20535 {
    private final Productionnull_20535 production = new Productionnull_20535("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
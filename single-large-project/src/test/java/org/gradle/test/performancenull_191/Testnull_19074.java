package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19074 {
    private final Productionnull_19074 production = new Productionnull_19074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21438 {
    private final Productionnull_21438 production = new Productionnull_21438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
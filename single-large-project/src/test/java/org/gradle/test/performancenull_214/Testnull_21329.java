package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21329 {
    private final Productionnull_21329 production = new Productionnull_21329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
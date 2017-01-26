package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21363 {
    private final Productionnull_21363 production = new Productionnull_21363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
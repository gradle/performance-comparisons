package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21375 {
    private final Productionnull_21375 production = new Productionnull_21375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
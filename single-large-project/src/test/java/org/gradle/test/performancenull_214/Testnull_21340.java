package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21340 {
    private final Productionnull_21340 production = new Productionnull_21340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
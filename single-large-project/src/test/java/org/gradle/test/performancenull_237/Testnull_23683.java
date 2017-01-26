package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23683 {
    private final Productionnull_23683 production = new Productionnull_23683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
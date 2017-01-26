package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42173 {
    private final Productionnull_42173 production = new Productionnull_42173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
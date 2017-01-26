package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8250 {
    private final Productionnull_8250 production = new Productionnull_8250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
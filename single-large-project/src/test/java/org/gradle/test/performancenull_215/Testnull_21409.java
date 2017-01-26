package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21409 {
    private final Productionnull_21409 production = new Productionnull_21409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
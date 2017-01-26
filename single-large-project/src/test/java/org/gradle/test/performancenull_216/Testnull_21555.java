package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21555 {
    private final Productionnull_21555 production = new Productionnull_21555("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
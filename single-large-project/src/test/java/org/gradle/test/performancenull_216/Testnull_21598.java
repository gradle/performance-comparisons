package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21598 {
    private final Productionnull_21598 production = new Productionnull_21598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
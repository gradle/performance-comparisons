package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23103 {
    private final Productionnull_23103 production = new Productionnull_23103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
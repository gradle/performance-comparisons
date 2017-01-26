package org.gradle.test.performancenull_7;

import static org.junit.Assert.*;

public class Testnull_601 {
    private final Productionnull_601 production = new Productionnull_601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
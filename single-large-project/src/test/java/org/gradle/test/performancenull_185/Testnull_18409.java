package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18409 {
    private final Productionnull_18409 production = new Productionnull_18409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
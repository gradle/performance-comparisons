package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18476 {
    private final Productionnull_18476 production = new Productionnull_18476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34493 {
    private final Productionnull_34493 production = new Productionnull_34493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
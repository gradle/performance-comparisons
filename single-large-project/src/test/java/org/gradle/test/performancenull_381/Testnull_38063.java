package org.gradle.test.performancenull_381;

import static org.junit.Assert.*;

public class Testnull_38063 {
    private final Productionnull_38063 production = new Productionnull_38063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36788 {
    private final Productionnull_36788 production = new Productionnull_36788("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
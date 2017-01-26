package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20201 {
    private final Productionnull_20201 production = new Productionnull_20201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
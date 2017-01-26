package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20248 {
    private final Productionnull_20248 production = new Productionnull_20248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
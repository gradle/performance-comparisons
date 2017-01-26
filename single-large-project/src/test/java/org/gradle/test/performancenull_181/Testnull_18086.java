package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18086 {
    private final Productionnull_18086 production = new Productionnull_18086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
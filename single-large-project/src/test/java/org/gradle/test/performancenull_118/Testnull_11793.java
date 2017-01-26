package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11793 {
    private final Productionnull_11793 production = new Productionnull_11793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
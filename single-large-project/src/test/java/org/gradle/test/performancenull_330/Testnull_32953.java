package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32953 {
    private final Productionnull_32953 production = new Productionnull_32953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
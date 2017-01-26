package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32919 {
    private final Productionnull_32919 production = new Productionnull_32919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
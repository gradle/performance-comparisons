package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32793 {
    private final Productionnull_32793 production = new Productionnull_32793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
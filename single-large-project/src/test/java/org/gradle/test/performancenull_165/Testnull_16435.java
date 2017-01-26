package org.gradle.test.performancenull_165;

import static org.junit.Assert.*;

public class Testnull_16435 {
    private final Productionnull_16435 production = new Productionnull_16435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
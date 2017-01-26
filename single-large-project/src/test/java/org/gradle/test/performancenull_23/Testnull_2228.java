package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2228 {
    private final Productionnull_2228 production = new Productionnull_2228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
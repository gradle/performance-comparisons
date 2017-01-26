package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2199 {
    private final Productionnull_2199 production = new Productionnull_2199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
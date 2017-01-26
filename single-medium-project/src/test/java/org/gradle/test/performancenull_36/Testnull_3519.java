package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3519 {
    private final Productionnull_3519 production = new Productionnull_3519("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
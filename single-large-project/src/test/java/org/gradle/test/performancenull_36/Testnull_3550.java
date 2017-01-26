package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3550 {
    private final Productionnull_3550 production = new Productionnull_3550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
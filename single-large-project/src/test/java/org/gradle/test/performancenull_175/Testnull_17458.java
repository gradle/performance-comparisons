package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17458 {
    private final Productionnull_17458 production = new Productionnull_17458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
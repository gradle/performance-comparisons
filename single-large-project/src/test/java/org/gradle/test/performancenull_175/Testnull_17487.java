package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17487 {
    private final Productionnull_17487 production = new Productionnull_17487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18550 {
    private final Productionnull_18550 production = new Productionnull_18550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
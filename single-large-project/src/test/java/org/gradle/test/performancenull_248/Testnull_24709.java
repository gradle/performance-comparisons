package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24709 {
    private final Productionnull_24709 production = new Productionnull_24709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
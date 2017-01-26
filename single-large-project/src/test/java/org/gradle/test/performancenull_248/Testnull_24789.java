package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24789 {
    private final Productionnull_24789 production = new Productionnull_24789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32789 {
    private final Productionnull_32789 production = new Productionnull_32789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
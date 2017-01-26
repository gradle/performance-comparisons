package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40308 {
    private final Productionnull_40308 production = new Productionnull_40308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
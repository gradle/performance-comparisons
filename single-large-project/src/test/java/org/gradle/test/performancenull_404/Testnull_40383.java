package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40383 {
    private final Productionnull_40383 production = new Productionnull_40383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
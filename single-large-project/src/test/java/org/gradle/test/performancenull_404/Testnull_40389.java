package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40389 {
    private final Productionnull_40389 production = new Productionnull_40389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
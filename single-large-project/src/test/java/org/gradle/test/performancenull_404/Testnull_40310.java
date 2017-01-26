package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40310 {
    private final Productionnull_40310 production = new Productionnull_40310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
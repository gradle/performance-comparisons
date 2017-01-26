package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40388 {
    private final Productionnull_40388 production = new Productionnull_40388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
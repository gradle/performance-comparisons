package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40301 {
    private final Productionnull_40301 production = new Productionnull_40301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
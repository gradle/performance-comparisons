package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40359 {
    private final Productionnull_40359 production = new Productionnull_40359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
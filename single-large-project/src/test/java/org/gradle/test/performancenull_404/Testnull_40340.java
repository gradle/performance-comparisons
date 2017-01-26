package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40340 {
    private final Productionnull_40340 production = new Productionnull_40340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
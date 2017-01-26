package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40348 {
    private final Productionnull_40348 production = new Productionnull_40348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40396 {
    private final Productionnull_40396 production = new Productionnull_40396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
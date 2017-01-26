package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40355 {
    private final Productionnull_40355 production = new Productionnull_40355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
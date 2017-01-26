package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40369 {
    private final Productionnull_40369 production = new Productionnull_40369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
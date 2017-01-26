package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3576 {
    private final Productionnull_3576 production = new Productionnull_3576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
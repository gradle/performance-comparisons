package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25409 {
    private final Productionnull_25409 production = new Productionnull_25409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
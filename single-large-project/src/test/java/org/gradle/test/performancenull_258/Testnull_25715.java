package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25715 {
    private final Productionnull_25715 production = new Productionnull_25715("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25766 {
    private final Productionnull_25766 production = new Productionnull_25766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
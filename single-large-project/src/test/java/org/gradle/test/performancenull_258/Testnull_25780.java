package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25780 {
    private final Productionnull_25780 production = new Productionnull_25780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
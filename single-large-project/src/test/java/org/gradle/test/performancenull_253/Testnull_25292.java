package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25292 {
    private final Productionnull_25292 production = new Productionnull_25292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48026 {
    private final Productionnull_48026 production = new Productionnull_48026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
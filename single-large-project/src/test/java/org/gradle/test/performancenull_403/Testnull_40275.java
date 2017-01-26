package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40275 {
    private final Productionnull_40275 production = new Productionnull_40275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
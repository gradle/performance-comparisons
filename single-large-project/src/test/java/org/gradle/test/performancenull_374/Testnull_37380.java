package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37380 {
    private final Productionnull_37380 production = new Productionnull_37380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
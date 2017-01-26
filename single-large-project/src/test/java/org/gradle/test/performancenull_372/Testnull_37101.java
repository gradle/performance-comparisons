package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37101 {
    private final Productionnull_37101 production = new Productionnull_37101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
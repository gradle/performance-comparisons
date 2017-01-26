package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37141 {
    private final Productionnull_37141 production = new Productionnull_37141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
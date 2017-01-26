package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7221 {
    private final Productionnull_7221 production = new Productionnull_7221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
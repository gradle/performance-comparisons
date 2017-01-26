package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7243 {
    private final Productionnull_7243 production = new Productionnull_7243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
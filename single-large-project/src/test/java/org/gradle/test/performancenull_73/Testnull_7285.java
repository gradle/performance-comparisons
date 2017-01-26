package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7285 {
    private final Productionnull_7285 production = new Productionnull_7285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
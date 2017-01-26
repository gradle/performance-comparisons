package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25519 {
    private final Productionnull_25519 production = new Productionnull_25519("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
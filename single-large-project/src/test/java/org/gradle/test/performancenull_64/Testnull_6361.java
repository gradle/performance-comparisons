package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6361 {
    private final Productionnull_6361 production = new Productionnull_6361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
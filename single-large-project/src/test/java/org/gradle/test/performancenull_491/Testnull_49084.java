package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49084 {
    private final Productionnull_49084 production = new Productionnull_49084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}